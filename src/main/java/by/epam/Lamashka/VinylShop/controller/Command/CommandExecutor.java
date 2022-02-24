package by.epam.Lamashka.VinylShop.controller.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
  private final Map<CommandName, Command> commands = new HashMap<>();
  private Command command;

  public CommandExecutor() {
    commands.put(CommandName.LOGIN, new LoginCommand());
    commands.put(CommandName.REGISTER, new RegisterCommand());
    commands.put(CommandName.PASSWORD_CHANGE, new PasswordChangeCommand());
  }

  public Command getCommand(CommandName commandName) {
    return commands.get(commandName);
  }
}
