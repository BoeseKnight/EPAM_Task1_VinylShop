package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.AdminView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public class DeleteProductFromBasket implements Command {
  private final UserService userService = ServiceFactory.getInstance().getUserService();

  @Override
  public Pair<String, View> execute(String parameters) {
    return new Pair("PRODUCT WAS DELETED FROM BASKET", new CustomerView());
  }
}
