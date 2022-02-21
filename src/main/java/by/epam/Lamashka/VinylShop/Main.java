package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.Controller.Controller;
import by.epam.Lamashka.VinylShop.Entitiy.Product;
import by.epam.Lamashka.VinylShop.Entitiy.UserRole;
import by.epam.Lamashka.VinylShop.Entitiy.VinylProduct;
import by.epam.Lamashka.VinylShop.View.Menu;
import by.epam.Lamashka.VinylShop.View.View;
import by.epam.Lamashka.VinylShop.View.ViewProvider;

public class Main {

  public static void main(String[] args) {
    //        Controller controller = new Controller();
    //        ViewProvider viewProvider = new ViewProvider(controller);
    //        viewProvider.getView("1").show();
    //        Product product = new VinylProduct();
    //        VinylProduct vinylProduct = (VinylProduct) product;
    //        System.out.println(product);
    //        for (UserRole a : UserRole.values()) {
    //            System.out.println(a);
    //        }
    Menu menu = new Menu();
    menu.show();
    //        ViewProvider viewProvider= new ViewProvider();
    //        viewProvider.getView("3").show();
    //        view.show();
  }
}
