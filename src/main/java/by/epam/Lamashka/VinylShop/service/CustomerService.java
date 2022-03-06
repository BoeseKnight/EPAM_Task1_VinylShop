package by.epam.Lamashka.VinylShop.service;

import by.epam.Lamashka.VinylShop.entity.Customer;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;

public interface CustomerService {
    Customer register(String email, String password);
    boolean addProductToBasket(Customer customer, VinylProduct vinylProduct);

}
