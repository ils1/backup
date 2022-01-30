package base;

public interface Game {
    boolean complete();
    void step(Command command);

}
