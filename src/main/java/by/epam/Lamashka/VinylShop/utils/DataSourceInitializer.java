package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.Shop;
import by.epam.Lamashka.VinylShop.dao.DAO;
import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;
import by.epam.Lamashka.VinylShop.entity.VinylRecord;

public class DataSourceInitializer implements Initializer {
  @Override
  public void initialize() {
    DAO<User> userDAO = DAOFactory.getInstance().getUserDAO();
    DAO<VinylProduct> vinylProductDAO = DAOFactory.getInstance().getVinylProductDAO();
    DAO<VinylRecord> vinylRecordDAO = DAOFactory.getInstance().getVinylRecordDAO();

    Shop shop = ShopDeserialization.deserialize();
    if (shop != null) {
      for (User user : shop.getUsers()) {
        userDAO.save(user);
      }
      for (VinylRecord vinylRecord : shop.getVinylRecords()) {
        vinylRecordDAO.save(vinylRecord);
      }
      for (VinylProduct vinylProduct : shop.getVinylProducts()) {
        vinylProductDAO.save(vinylProduct);
      }
    } else {
      Initializer admin = new AdminInitializer();
      admin.initialize();
      Initializer products = new ProductsInitializer();
      products.initialize();
    }
  }
}
