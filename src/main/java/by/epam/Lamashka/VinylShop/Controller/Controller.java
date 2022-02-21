package by.epam.Lamashka.VinylShop.Controller;

import by.epam.Lamashka.VinylShop.Controller.Command.Command;
import by.epam.Lamashka.VinylShop.Controller.Command.CommandExecutor;
import by.epam.Lamashka.VinylShop.Controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.View.View;
import javafx.util.Pair;

public class Controller {
  private final CommandExecutor commandExecutor = new CommandExecutor();

  public Pair<String, View> executeCommand(CommandName commandName, String parameters) {
    Command command;
    command = commandExecutor.getCommand(commandName);
    return command.execute(parameters);
  }
}
