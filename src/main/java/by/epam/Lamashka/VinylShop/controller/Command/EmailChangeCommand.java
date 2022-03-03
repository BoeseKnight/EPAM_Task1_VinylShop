package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.Menu;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public class EmailChangeCommand implements Command {
  private final UserService userService = ServiceFactory.getInstance().getUserService();
  private final Session session = Session.getInstance();

  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    System.out.println(session.getUser());
    if(userService.login(session.getUser().getEmailAddress(), password) == null){
      return new Pair<>(
              "You have entered your password incorrectly.", new CustomerView());
    }
    if (userService.changeEmail(session.getUser().getEmailAddress(), password, email) != null) {
      return new Pair("EMAIL WAS CHANGED", new Menu());
    } else return new Pair<>(
            "This email is already taken.", new CustomerView());

  }
}
