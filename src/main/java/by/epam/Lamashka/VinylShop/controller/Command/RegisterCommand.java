package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.AuthorizationView;
import by.epam.Lamashka.VinylShop.view.Menu;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public class RegisterCommand implements Command {
  private final UserService userService = new UserService();

  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
//    System.out.println("Register Command was executed. Parameters: " + params[0] + " " + params[1]);
    if (userService.register(email, password) == null) {
      return new Pair<>("You are already registered", new Menu());

    } else {
//      System.out.println(User.getCount());
      return new Pair<>("Registration passed successfully", new AuthorizationView());
    }
  }
}
