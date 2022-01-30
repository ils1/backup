import base.GameVisualizer;
import base.UserCommandProvider;
import core.ConsoleCommandProvider;
import core.ConsoleVisualizer;
import core.GameEnvironment;

public class GameRun {
    public static void main(String[] args) {
        GameEnvironment game = GameEnvironment.create();
        GameVisualizer visualizer = ConsoleVisualizer.create();
        UserCommandProvider commandProvider = ConsoleCommandProvider.create();

        while(!game.complete()) {
            visualizer.visualize(game);
            game.step(commandProvider.getNextCommand());
        }
    }
}
