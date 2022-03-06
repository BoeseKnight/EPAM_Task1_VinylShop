package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.Shop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShopSerialization {
  public static void serialize() {
    Shop shop = new Shop();
    System.out.println(DataSource.getInstance().getUsers());
    shop.setUsers(DataSource.getInstance().getUsers());
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
      System.out.println(shop.hashCode());
      System.out.println(shop);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
