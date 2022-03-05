package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.Shop;

import java.io.*;

public class ShopDeserialization {
  public static Shop deserialize() {
    Shop shop = null;
    if (new File("src\\save.ser").isFile()) {
      FileInputStream fileInputStream = null;
      try {
        fileInputStream = new FileInputStream("src\\save.ser");
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
      ObjectInputStream objectInputStream;
      try {
        objectInputStream = new ObjectInputStream(fileInputStream);
        shop = (Shop) objectInputStream.readObject();
        System.out.println(shop.hashCode());
        System.out.println(shop);
        objectInputStream.close();
        fileInputStream.close();
      } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
    return shop;
  }
}
