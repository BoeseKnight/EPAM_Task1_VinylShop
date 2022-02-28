package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.AuthorizationView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public class PasswordChangeCommand implements Command {
  private final UserService userService = new UserService();

  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    //    System.out.println("CHANGE Command was executed. Parameters: " + params[0] + " " +
    // params[1]);

    if (userService.changePassword(email, password) == null) {
      return new Pair<>("You have entered either your email address or password incorrectly.", new CustomerView());
    } else {
      return new Pair<>("PASSWORD WAS CHANGED", new CustomerView());
    }
  }
}
