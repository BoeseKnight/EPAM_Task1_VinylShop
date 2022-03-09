package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.entity.*;
import by.epam.Lamashka.VinylShop.utils.DataSourceInitializer;
import by.epam.Lamashka.VinylShop.utils.Initializer;
import by.epam.Lamashka.VinylShop.utils.ProductsInitializer;
import by.epam.Lamashka.VinylShop.utils.ShopSerialization;
import by.epam.Lamashka.VinylShop.view.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

/**
 *
 *
 * <h1>VinylShop!</h1>
 *
 * This is a console prototype of the future Web Vinyl Records Shop.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class Main {
  private static Logger logger = LogManager.getLogger(Main.class);

  /**
   * main.
   *
   * @param args an array of {@link java.lang.String} objects
   * @throws java.io.FileNotFoundException if any.
   */
  public static void main(String[] args) throws FileNotFoundException {
    Initializer dataSource = new DataSourceInitializer();
    dataSource.initialize();

    Menu menu = new Menu();
    menu.show();
    logger.info("Number of created users: " + User.getCount());
    logger.info("Number of created products: " + Product.getCount());
    logger.info("Number of created records: " + VinylRecord.getCount());
    logger.info("Number of created songs: " + Song.getCount());
    logger.info("Number of created addresses: " + Address.getCount());
    logger.info("Number of created customers: " + Customer.getCount());
    logger.info("Number of created orders: " + Order.getCount());
    logger.info("Number of created baskets: " + Basket.getCount());

    ShopSerialization.serialize();
  }
}
