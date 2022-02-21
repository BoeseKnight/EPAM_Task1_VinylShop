package by.epam.Lamashka.VinylShop.Controller.Command;

import by.epam.Lamashka.VinylShop.Service.UserService;
import by.epam.Lamashka.VinylShop.View.AuthorizationView;
import by.epam.Lamashka.VinylShop.View.View;
import javafx.util.Pair;

public class LoginCommand implements Command {
  private final UserService userService = new UserService();

  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    if (userService.login(email, password) == null) {
      return new Pair<>(
          "You have entered either your email address or password incorrectly.",
          new AuthorizationView());
    } else {
      return new Pair<>("LogIn passed successfully", new AuthorizationView());
    }
  }
}
