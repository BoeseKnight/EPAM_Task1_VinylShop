package by.epam.Lamashka.VinylShop.service;

import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.dao.UserDAO;
import by.epam.Lamashka.VinylShop.entity.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * UserService class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class UserServiceImpl implements UserService {
  private UserDAO userDAO = DAOFactory.getInstance().getUserDAO();

  public UserServiceImpl() {}

  public UserServiceImpl(UserDAO userDAO) {
    this.userDAO = userDAO;
  }
  /**
   * login.
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
   * register.
   *
   * @param email a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  @Override
  public User register(String email, String password) {
    User userToFind = userDAO.findByEmail(email);
    if (userToFind != null) {
      return null;
    } else {
      User user = new User(email, password);
      userDAO.save(user);
      return user;
    }
  }

  /**
   * changePassword.
   *
   * @param email a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  @Override
  public User changePassword(String email, String password) {
    User user = userDAO.findByEmail(email);
    if (!user.getPassword().equals(password)) {
      user.setPassword(password);
      userDAO.update(user);
      return user;
    } else {
      return null;
    }
  }

  /**
   * changeEmail.
   *
   * @param oldEmail a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @param newEmail a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  @Override
  public User changeEmail(String oldEmail, String newEmail, String password) {
    User user = userDAO.findByEmail(oldEmail);
    if (userDAO.findByEmail(newEmail) == null) {
      user.setEmailAddress(newEmail);
      userDAO.update(user);
      return user;
    } else return null;
  }

  /**
   * usersSort.
   *
   * @return a {@link java.util.Collection} object
   */
  @Override
  public Collection<User> usersSort() {
    Collections.sort((ArrayList<User>) userDAO.getAll());
    return userDAO.getAll();
  }
}
