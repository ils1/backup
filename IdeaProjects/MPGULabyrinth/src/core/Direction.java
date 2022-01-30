package core;

public enum Direction {
    Up(0, -1),
    Down(0, 1),
    Left(-1, 0),
    Right(1, 0);

    private int xOff;
    private int yOff;

    Direction(int xOffset, int yOffset) {
        xOff = xOffset;
        yOff = yOffset;
    }


    public int xOffset(){
        return xOff;
    }
    public int yOffset(){
        return yOff;
    }

}
