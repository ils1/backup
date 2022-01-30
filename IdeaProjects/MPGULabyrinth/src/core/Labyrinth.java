package core;

public class Labyrinth {
    private Tile[][] tiles;

    public Labyrinth(Tile[][] tiles) {
        this.tiles = tiles;
    }

    public Tile getTile(int xPos, int yPos) {
        if (tiles == null || yPos < 0 || yPos >= tiles.length || xPos < 0 || xPos > tiles[yPos].length)
            return Tile.getIndestructible();
        return tiles[yPos][xPos];

    }
}
