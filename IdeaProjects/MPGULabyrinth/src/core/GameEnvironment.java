package core;

import base.Command;
import base.Game;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GameEnvironment implements Game {
    private static final String dataPath = "data";

    private Labyrinth labyrinth;
    private int worldWidth;
    private int worldHeight;
    private Person person;


    public Labyrinth getLabyrinth() {
        return labyrinth;
    }
    public int getWorldWidth() {
        return worldWidth;
    }
    public int getWorldHeight() {
        return worldHeight;
    }
    public Person getPerson(){
        return person;
    }

    public static GameEnvironment create(){
        var ge = new GameEnvironment();
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(dataPath + "/level"));
            Scanner sc = new Scanner(reader);
            while(processWorldSettings(sc, ge)) {
            }
            readLevel(sc, ge);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return ge;
    }



    private static void readLevel(Scanner sc, GameEnvironment game) {
    Tile[][] tiles = new Tile[game.worldHeight][game.getWorldWidth()];
    for (int i = 0; i < game.worldHeight; ++i){
        String line = sc.nextLine();
        for (int j = 0; j < game.worldWidth; ++j){
            switch (line.charAt(j)) {
                case '_' -> tiles[i][j] = new EmptyTile();
                case '#' -> tiles[i][j] = new WallTile();
            }
        }
    }
    game.labyrinth = new Labyrinth(tiles);
    }

    private static boolean processWorldSettings(Scanner sc, GameEnvironment game) {
        String line = sc.nextLine();
        if (line.equals(""))
            return false;
        String[] tokens = line.split(": ");
        switch (tokens[0]) {
            case "width" -> game.worldWidth = Integer.parseInt(tokens[1]);
            case "height" -> game.worldHeight = Integer.parseInt(tokens[1]);
            case "person" -> setupPerson(game, tokens[1]);
        }
        return true;
    }

    private static void setupPerson(GameEnvironment game, String description) {
        String[] tokens = description.split(" ");
        game.person = new Person(
                Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])
        );
    }

    private boolean complete = false;

    public void completeGame(){
        complete = true;
    }

    @Override
    public boolean complete() {
        return complete;
    }

    @Override
    public void step(Command command) {
        command.process(this);
    }
}
