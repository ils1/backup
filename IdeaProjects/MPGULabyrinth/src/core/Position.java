package core;

import java.io.PipedOutputStream;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }
    public void setY(int newY) {
        y = newY;
    }
    public void moveInDirection(Direction direction) {
        x += direction.xOffset();
        y+= direction.yOffset();
    }

}
