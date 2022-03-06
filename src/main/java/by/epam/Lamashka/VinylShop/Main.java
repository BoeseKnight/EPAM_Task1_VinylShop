package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.service.UserServiceImpl;
import by.epam.Lamashka.VinylShop.utils.*;
import by.epam.Lamashka.VinylShop.view.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

/**
 * <h1>VinylShop!</h1>
 * This is a console prototype of the future Web Vinyl Records Shop.
 *
 * @author  Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since   05-03-2022
 */
public class Main {
  private static Logger logger = LogManager.getLogger(Main.class);

  /**
   * <p>main.</p>
   *
   * @param args an array of {@link java.lang.String} objects
   * @throws java.io.FileNotFoundException if any.
   */
  public static void main(String[] args) throws FileNotFoundException {
    Initializer dataSource=new DataSourceInitializer();
    dataSource.initialize();
    Initializer admin=new AdminInitializer();
    admin.initialize();
    Initializer products = new ProductsInitializer();
    products.initialize();
    Menu menu = new Menu();
    menu.show();
    logger.info("shit");
    ShopSerialization.serialize();
  }
}
