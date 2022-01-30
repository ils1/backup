package core;

import base.Command;

public class ExitCommand implements Command {

    @Override
    public void process(GameEnvironment game) {
        game.completeGame();
    }
}
