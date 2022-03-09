package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.Main;
import by.epam.Lamashka.VinylShop.Shop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShopSerialization {
  private static Logger logger = LogManager.getLogger(ShopSerialization.class);

  public static void serialize() {
    Shop shop = new Shop();
    logger.info("Serialized Data:");
    logger.info(DataSource.getInstance().getUsers());
    shop.setUsers(DataSource.getInstance().getUsers());
    logger.info(DataSource.getInstance().getVinylRecords());
    shop.setVinylRecords(DataSource.getInstance().getVinylRecords());
    logger.info(DataSource.getInstance().getVinylRecords());
    shop.setVinylProducts(DataSource.getInstance().getVinylProducts());
    FileOutputStream outputStream = null;
    try {
      outputStream = new FileOutputStream("save.ser");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    ObjectOutputStream objectOutputStream;
    try {
      objectOutputStream = new ObjectOutputStream(outputStream);
      objectOutputStream.writeObject(shop);
      objectOutputStream.close();
      outputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
