package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.view.AdminView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

/**
 * AddProductToShopCommand class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class AddProductToShopCommand implements Command {
  /** {@inheritDoc} */
  @Override
  public Pair<String, View> execute(String parameters) {
    return new Pair("PRODUCT WAS ADDED TO SHOP", new AdminView());
  }
}
