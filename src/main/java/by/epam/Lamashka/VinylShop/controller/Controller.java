package by.epam.Lamashka.VinylShop.controller;

import by.epam.Lamashka.VinylShop.controller.Command.CommandExecutor;
import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public class Controller {
  private final CommandExecutor commandExecutor = new CommandExecutor();

  public Pair<String, View> executeCommand(CommandName commandName, String parameters) {
    return commandExecutor.getCommand(commandName).execute(parameters);
  }
}
