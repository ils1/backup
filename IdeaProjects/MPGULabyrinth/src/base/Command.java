package base;
import core.GameEnvironment;


public interface Command {
    void process(GameEnvironment game);
}
