package core;

import base.Command;
import base.UserCommandProvider;

import java.util.Scanner;

public class ConsoleCommandProvider implements UserCommandProvider {
    private Scanner scanner;

    @Override
    public Command getNextCommand() {
       String command = scanner.nextLine();
        return switch (command) {
            case "q", "Q" -> new ExitCommand();
            case "w", "W" -> new MoveCommand(Direction.Up);
            case "s", "S" -> new MoveCommand(Direction.Down);
            case "a", "A" -> new MoveCommand(Direction.Left);
            case "d", "D" -> new MoveCommand(Direction.Right);
            default -> new NothingCommand();
        };
    }

    public static UserCommandProvider create() {
        ConsoleCommandProvider provider = new ConsoleCommandProvider();
        provider.scanner = new Scanner(System.in);
        return provider;
    }
}
