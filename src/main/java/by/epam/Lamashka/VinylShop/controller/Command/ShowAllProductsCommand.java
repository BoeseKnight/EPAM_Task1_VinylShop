package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.entity.UserRole;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.VinylProductService;
import by.epam.Lamashka.VinylShop.view.AdminView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * ShowAllProducts class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class ShowAllProductsCommand implements Command {
  private final VinylProductService vinylProductService =
      ServiceFactory.getInstance().getVinylProductService();
  private static Logger logger = LogManager.getLogger(ShowAllProductsCommand.class);
  /** {@inheritDoc} */
  @Override
  public Pair<String, View> execute(String parameters) {
    Session session = Session.getInstance();
    View nextView =
        (session.getUser().getRole() == UserRole.Admin) ? new AdminView() : new CustomerView();
    List<VinylProduct> products = (List<VinylProduct>) vinylProductService.productsSort();
    for (int i = 0; i < products.size(); i++) {
      logger.info(i + 1 + ". " + products.get(i));
    }
    return new Pair("ALL PRODUCTS WERE PRINTED.", nextView);
  }
}
