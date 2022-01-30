package core;

import base.GameVisualizer;

import java.io.*;
import java.util.Scanner;

public class ConsoleVisualizer implements GameVisualizer {
    private static final String configPath = "configs/console_visualizer";

    private char walkableTile = '_';
    private char nonWalkableTile = '#';
    private char person = '@';
    @Override
    public void visualize(GameEnvironment game) {
        for (int y = 0; y < game.getWorldHeight(); ++y) {
            for (int x = 0; x < game.getWorldWidth(); ++x) {
                if (personInTile(x, y, game)) {
                    drawPerson();
                }
                else if (game.getLabyrinth().getTile(x, y).isWalkable())
                    drawWalkable();
                else
                    drawNonWalkable();
            }
            System.out.println();
        }
    }

    private void drawWalkable() {
        System.out.print(walkableTile);
    }
    private void drawNonWalkable() {
        System.out.print(nonWalkableTile);
    }


    private void drawPerson() {
        System.out.print(person);
    }

    private boolean personInTile(int x, int y, GameEnvironment game) {
        return game.getPerson().getX() == x && game.getPerson().getY() == y;
    }

    private void readConfig(){
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(configPath));
            Scanner sc = new Scanner(reader);
            while(sc.hasNext()) {
                processConfigLine(sc);
            }
                reader.close();
            }
        catch (IOException e) {
                e.printStackTrace();
        }

    }

    private void processConfigLine(Scanner sc) {
        String line = sc.nextLine();
        String[] tokens = line.split(": ");
        switch (tokens[0]) {
            case "walkable" -> walkableTile = tokens[1].charAt(0);
            case "nonWalkable" -> nonWalkableTile = tokens[1].charAt(0);
            case "person" -> person = tokens[1].charAt(0);

        }
    }

    public static GameVisualizer create() {
        var visualizer = new ConsoleVisualizer();
        visualizer.readConfig();
        return visualizer;
    }
}
