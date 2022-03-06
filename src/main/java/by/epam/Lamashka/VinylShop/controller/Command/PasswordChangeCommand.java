package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.service.UserServiceImpl;
import by.epam.Lamashka.VinylShop.view.Menu;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

/**
 * <p>PasswordChangeCommand class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class PasswordChangeCommand implements Command {
  private final UserService userService = ServiceFactory.getInstance().getUserService();
  private Session session = Session.getInstance();
  /**
   * {@inheritDoc}
   *
   * This method is used to execute Password Change command. Its main purpose is to change user's password.
   */
  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    System.out.println(session.getUser());
    userService.changePassword(session.getUser().getEmailAddress(), password);
    return new Pair<>("PASSWORD WAS CHANGED", new Menu());
  }
}
