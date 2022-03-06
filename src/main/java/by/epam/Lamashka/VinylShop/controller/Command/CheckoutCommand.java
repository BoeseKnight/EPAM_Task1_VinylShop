package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.entity.UserRole;
import by.epam.Lamashka.VinylShop.view.AdminView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

/**
 * CheckoutCommand class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class CheckoutCommand implements Command {
  /** {@inheritDoc} */
  @Override
  public Pair<String, View> execute(String parameters) {
    Session session = Session.getInstance();

    View nextView =
        (session.getUser().getRole() == UserRole.Admin) ? new AdminView() : new CustomerView();
    return new Pair("CHECKOUT WAS EXECUTED", nextView);
  }
}
