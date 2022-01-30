package core;

public abstract class Tile {

    public abstract boolean isWalkable();

    private static class Indestructible extends Tile {
        public boolean isWalkable() {
            return false;
        }
    }

        public static Tile getIndestructible() {
            return indestructible;
        }

        private static Tile indestructible = new Indestructible();
    }

