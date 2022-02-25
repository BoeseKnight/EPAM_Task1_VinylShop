package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.utils.Initializer;
import by.epam.Lamashka.VinylShop.utils.ProductsInitializer;
import by.epam.Lamashka.VinylShop.view.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

public class Main {
  private static Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args) {
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
