package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.AuthorizationView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.Menu;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginCommand implements Command {
  private final UserService userService = ServiceFactory.getInstance().getUserService();

  @Override
  public Pair<String, View> execute(String parameters) {
    Session session=Session.getInstance();
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    User user=userService.login(email, password);
    if (user == null) {
      return new Pair<>(
          "You have entered either your email address or password incorrectly.", new Menu());
    } else {
        session.setUser(user);
        System.out.println(session.getUser());
      return new Pair<>("LogIn passed successfully", new CustomerView());
    }
  }
}
