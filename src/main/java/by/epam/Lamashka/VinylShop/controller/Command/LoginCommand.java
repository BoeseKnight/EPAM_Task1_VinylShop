package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.AuthorizationView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.Menu;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginCommand implements Command {
  private final UserService userService = new UserService();

  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    if (userService.login(email, password) == null) {
      return new Pair<>(
          "You have entered either your email address or password incorrectly.", new Menu());
    } else {
      return new Pair<>("LogIn passed successfully", new CustomerView());
    }
  }
}
