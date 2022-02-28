package by.epam.Lamashka.VinylShop.controller;

import by.epam.Lamashka.VinylShop.controller.Command.CommandProvider;
import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public class Controller {
  private final CommandProvider commandProvider = new CommandProvider();

  public Pair<String, View> executeCommand(CommandName commandName, String parameters) {
    return commandProvider.getCommand(commandName).execute(parameters);
  }
}
