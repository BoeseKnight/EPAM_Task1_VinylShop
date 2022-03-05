package by.epam.Lamashka.VinylShop.controller;

import by.epam.Lamashka.VinylShop.controller.Command.CommandProvider;
import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

/**
 * <p>Controller class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Controller {
  private final CommandProvider commandProvider = new CommandProvider();

  /**
   * <p>executeCommand.</p>
   *
   * @param commandName a {@link by.epam.Lamashka.VinylShop.controller.Command.CommandName} object
   * @param parameters a {@link java.lang.String} object
   * @return a Pair object
   */
  public Pair<String, View> executeCommand(CommandName commandName, String parameters) {
    return commandProvider.getCommand(commandName).execute(parameters);
  }
}
