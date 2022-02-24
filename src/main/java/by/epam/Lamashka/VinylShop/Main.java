package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.utils.Initializer;
import by.epam.Lamashka.VinylShop.utils.ProductsInitializer;
import by.epam.Lamashka.VinylShop.view.Menu;

import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.show();
//    Initializer products = new ProductsInitializer();
//    try {
//      products.initialize();
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    }
  }
}
