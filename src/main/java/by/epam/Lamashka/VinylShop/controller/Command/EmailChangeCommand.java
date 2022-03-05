package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.entity.UserRole;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.AdminView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.Menu;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public class EmailChangeCommand implements Command {
  private final UserService userService = ServiceFactory.getInstance().getUserService();
  private final Session session = Session.getInstance();
  /**
   * This method is used to execute Email Change command. Its main purpose is to change user's
   * email. It checks if the user wrote its password correctly to perform this command. If password
   * is incorrect, the user will be back to its customer view. If password is correct, program will
   * check if the written password is available. If it's not in use command will be executed
   * successfully and the user will be returned to Main menu,where it should log in with new user
   * data.
   *
   * @param parameters This parameter is string received from User. It includes new email address
   *     and password.
   * @return Returns String response to User and next View (Customer) .
   */
  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    System.out.println(session.getUser());
    View nextView= (session.getUser().getRole()==UserRole.Admin) ? new AdminView() : new CustomerView();
    if (userService.login(session.getUser().getEmailAddress(), password) == null) {
      return new Pair<>("You have entered your password incorrectly.", nextView);
    }
    if (userService.changeEmail(session.getUser().getEmailAddress(), password, email) != null) {
      return new Pair("EMAIL WAS CHANGED", new Menu());
    } else return new Pair<>("This email is already taken.", nextView);
  }
}
