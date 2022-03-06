package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.Shop;
import by.epam.Lamashka.VinylShop.dao.DAO;
import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.entity.User;

public class DataSourceInitializer implements Initializer {
  @Override
  public void initialize() {
    DAO<User> users = DAOFactory.getInstance().getUserDAO();
    Shop shop = ShopDeserialization.deserialize();
    if (shop != null) {
      for (User user : shop.getUsers()) {
        users.save(user);
      }
    }
    System.out.println(users);
  }
}
