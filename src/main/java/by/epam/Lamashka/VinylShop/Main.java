package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.utils.AdminInitializer;
import by.epam.Lamashka.VinylShop.utils.Initializer;
import by.epam.Lamashka.VinylShop.utils.ProductsInitializer;
import by.epam.Lamashka.VinylShop.view.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

/**
 * <h1>VinylShop!</h1>
 * This is a console prototype of the future Web Vinyl Records Shop.
 * @author  Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since   05-03-2022
 */
public class Main {
  private static Logger logger = LogManager.getLogger(Main.class);

  public static void main(String[] args) throws FileNotFoundException {
    Initializer admin=new AdminInitializer();
    admin.initialize();
    Menu menu = new Menu();
    menu.show();
    Initializer products = new ProductsInitializer();
    try {
      products.initialize();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    logger.info("shit");
    //    logger.debug("shit");
    //    logger.error("shit");

  }
}
