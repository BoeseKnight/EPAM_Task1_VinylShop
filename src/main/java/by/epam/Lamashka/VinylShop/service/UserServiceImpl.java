package by.epam.Lamashka.VinylShop.service;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.dao.DAO;
import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.dao.UserDAO;
import by.epam.Lamashka.VinylShop.entity.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>UserService class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class UserServiceImpl implements UserService {
  private static final UserDAO userDAO = DAOFactory.getInstance().getUserDAO();

  /**
   * <p>login.</p>
   *
   * @param email a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  @Override
  public User login(String email, String password) {
    User user = userDAO.findByEmailAndPassword(email, password);
    return user;
  }

  /**
   * <p>register.</p>
   *
   * @param email a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  @Override
  public User register(String email, String password) {
    User user = userDAO.findByEmail(email);
    if (user != null) {
      return null;
    } else {
      userDAO.save(new User(email, password));
      return userDAO.get(userDAO.getAll().size() - 1);
    }
  }

  /**
   * <p>changePassword.</p>
   *
   * @param email a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  @Override
  public User changePassword(String email, String password) {
    User user = userDAO.findByEmail(email);
    if (user != null) {
      user.setPassword(password);
      userDAO.update(user);
      return user;
    } else return null;
  }

  /**
   * <p>changeEmail.</p>
   *
   * @param oldEmail a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @param newEmail a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  @Override
  public User changeEmail(String oldEmail, String password, String newEmail) {
    User user = userDAO.findByEmail(oldEmail);
    if (userDAO.findByEmail(newEmail) == null) {
      user.setEmailAddress(newEmail);
      userDAO.update(user);
      return user;
    }
    else return null;

  }

  /**
   * <p>usersSort.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  @Override
  public Collection<User> usersSort() {
    Collections.sort((ArrayList<User>) userDAO.getAll());
    return userDAO.getAll();
  }
}
