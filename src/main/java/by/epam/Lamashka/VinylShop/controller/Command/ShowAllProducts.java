package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public class ShowAllProducts implements Command {
  @Override
  public Pair<String, View> execute(String parameters) {
    return new Pair("SHOP PRODUCTS:", new CustomerView());
  }
}
