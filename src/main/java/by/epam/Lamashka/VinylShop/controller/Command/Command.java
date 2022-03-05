package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

/**
 * <p>Command interface.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public interface Command {
  /**
   * <p>execute.</p>
   *
   * @param parameters a {@link java.lang.String} object
   * @return a Pair object
   */
  Pair<String, View> execute(String parameters);
}
