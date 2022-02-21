package by.epam.Lamashka.VinylShop.Controller;

import by.epam.Lamashka.VinylShop.Controller.Command.Command;
import by.epam.Lamashka.VinylShop.Controller.Command.CommandExecutor;
import by.epam.Lamashka.VinylShop.Controller.Command.CommandName;

public class Controller {
  private final CommandExecutor commandExecutor = new CommandExecutor();

  public String executeCommand(CommandName commandName, String parameters) {
    String response;
    Command command;
    command = commandExecutor.getCommand(commandName);
    response = command.execute(parameters);
    return response;
  }
}
