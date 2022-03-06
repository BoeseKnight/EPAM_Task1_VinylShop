package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.dao.UserDAO;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.UserRole;

/**
 * AdminInitializer class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class AdminInitializer implements Initializer {
  /** {@inheritDoc} */
  @Override
  public void initialize() {
    UserDAO users = DAOFactory.getInstance().getUserDAO();
    User admin = new User("admin@a", "admin", UserRole.Admin);
    if (!users.getAll().contains(admin)) {
      users.save(admin);
    }
  }
}
