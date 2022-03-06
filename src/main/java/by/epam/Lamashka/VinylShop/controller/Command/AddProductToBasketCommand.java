package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.entity.Basket;
import by.epam.Lamashka.VinylShop.entity.Customer;
import by.epam.Lamashka.VinylShop.entity.UserRole;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;
import by.epam.Lamashka.VinylShop.service.CustomerService;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.service.VinylProductService;
import by.epam.Lamashka.VinylShop.view.AdminView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * AddProductToBasketCommand class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class AddProductToBasketCommand implements Command {
  private final CustomerService customerService = ServiceFactory.getInstance().getCustomerService();
  private final UserService userService = ServiceFactory.getInstance().getUserService();
  private final VinylProductService vinylProductService =
      ServiceFactory.getInstance().getVinylProductService();
  private static Logger logger = LogManager.getLogger(AddProductToBasketCommand.class);

  /** {@inheritDoc} */
  @Override
  public Pair<String, View> execute(String parameters) {
    int productIndex=parseInt(parameters);
    Session session = Session.getInstance();
    View nextView =
        (session.getUser().getRole() == UserRole.Admin) ? new AdminView() : new CustomerView();
    Customer customer =
        customerService.register(
            session.getUser().getEmailAddress(), session.getUser().getPassword());
    session.setCustomer(customer);
    if (customerService.addProductToBasket(
        customer, vinylProductService.getProduct(productIndex))) {
      logger.info(customer.getBasket());
      return new Pair("PRODUCT WAS ADDED TO BASKET", nextView);
    }
    else return new Pair("THERE IS NO SUCH PRODUCT WITH ENTERED INDEX. ENTER 3 TO SEE ALL PRODUCTS.", nextView);
  }
}
