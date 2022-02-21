package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.Entitiy.Product;
import by.epam.Lamashka.VinylShop.Entitiy.UserRole;
import by.epam.Lamashka.VinylShop.Entitiy.VinylProduct;
import by.epam.Lamashka.VinylShop.View.Menu;

public class Main {

    public static void main(String[] args) {
        Product product = new VinylProduct();
        VinylProduct vinylProduct = (VinylProduct) product;
        System.out.println(product);
        for (UserRole a : UserRole.values()) {
            System.out.println(a);
        }
        Menu.run();
    }
}
