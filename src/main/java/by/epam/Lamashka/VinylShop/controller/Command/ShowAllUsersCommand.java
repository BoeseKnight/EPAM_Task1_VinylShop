package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.UserRole;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.AdminView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <p>ShowAllUsersCommand class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class ShowAllUsersCommand implements Command {
  private final UserService userService = ServiceFactory.getInstance().getUserService();
  private static Logger logger = LogManager.getLogger(ShowAllUsersCommand.class);

  /** {@inheritDoc} */
  @Override
  public Pair<String, View> execute(String parameters) {
    Session session = Session.getInstance();

    View nextView =
        (session.getUser().getRole() == UserRole.Admin) ? new AdminView() : new CustomerView();

    //    System.out.println(session.getUser());
    for (User user : userService.usersSort()) {
      logger.info(user);
    }
    return new Pair("ALL USERS ARE PRINTED.", nextView); // must be AdminView
  }
}
