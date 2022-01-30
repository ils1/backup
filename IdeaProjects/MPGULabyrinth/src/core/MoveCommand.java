package core;

import base.Command;

public class MoveCommand implements Command {
    Direction direction;

    public MoveCommand(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void process(GameEnvironment game) {
        int newX = game.getPerson().getX() + direction.xOffset();
        int newY = game.getPerson().getY() + direction.yOffset();

        if (game.getLabyrinth().getTile(newX, newY).isWalkable())
            game.getPerson().moveInDirection(direction);
    }
}
