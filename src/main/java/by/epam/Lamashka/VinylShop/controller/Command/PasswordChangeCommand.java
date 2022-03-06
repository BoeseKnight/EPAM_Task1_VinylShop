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

/**
 * PasswordChangeCommand class.
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
   * <p>This method is used to execute Password Change command. Its main purpose is to change user's
   * password.
   */
  @Override
  public Pair<String, View> execute(String parameters) {
    String[] params = parameters.split(" ");
    String currentPassword = params[0];
    String newPassword = params[1];

    System.out.println(session.getUser());
    View nextView =
        (session.getUser().getRole() == UserRole.Admin) ? new AdminView() : new CustomerView();
    if (!session.getUser().getPassword().equals(currentPassword)){
      return new Pair<>("YOU'VE ENTERED YOUR CURRENT PASSWORD INCORRECTLY!", nextView);
    }
    if (userService.changePassword(session.getUser().getEmailAddress(), newPassword) == null) {
      return new Pair<>("YOU'VE ENTERED YOUR CURRENT PASSWORD!", nextView);
    } else {
      return new Pair<>("PASSWORD WAS CHANGED", new Menu());
    }
  }
}
