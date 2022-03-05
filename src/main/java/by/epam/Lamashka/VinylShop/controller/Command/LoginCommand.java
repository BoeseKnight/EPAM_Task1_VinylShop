package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.UserRole;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.*;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginCommand implements Command {
  private final UserService userService = ServiceFactory.getInstance().getUserService();
  private final Session session = Session.getInstance();
  /**
   * This method is used to execute Login command.
   * @param parameters This parameter is string received from User. It includes email and password,
   * which are separated by white space
   * @return Returns String response to User and next View (Menu Or Customer) .
   */
  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    User user = userService.login(email, password);
    if (user == null) {
      return new Pair<>(
          "You have entered either your email address or password incorrectly.", new Menu());
    } else {
      session.setUser(user);
      View nextView= (session.getUser().getRole()== UserRole.Admin) ? new AdminView() : new CustomerView();
      System.out.println(session.getUser());
      return new Pair<>("LogIn passed successfully", nextView);
    }
  }
}
