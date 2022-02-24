package by.epam.Lamashka.VinylShop.service;

import by.epam.Lamashka.VinylShop.dao.DAO;
import by.epam.Lamashka.VinylShop.dao.UserDAO;
import by.epam.Lamashka.VinylShop.entity.User;

public class UserService {
  private static final DAO<User> userDAO = new UserDAO();

  public User login(String email, String password) {
    UserDAO userDAOImpl = (UserDAO) userDAO;
    User user = findByEmailAndPassword(email, password);
    return user;
  }

  public User register(String email, String password) {
    UserDAO userDAOImpl = (UserDAO) userDAO;
    User user = findByEmail(email);
    if (user != null) {
      return null;
    } else {
      userDAO.save(new User(email, password));
      return userDAO.get(userDAO.getAll().size() - 1);
    }
  }

  public User changePassword(String email, String password) {
    UserDAO userDAOImpl = (UserDAO) userDAO;
    User user = findByEmail(email);
    if (user != null) {
      user.setPassword(password);
      userDAO.update(user);
      return user;
    } else return null;
  }

  public User changeEmail(String email, String password) {
    UserDAO userDAOImpl = (UserDAO) userDAO;
    User user = findByEmail(email);
    if (user != null) {
      user.setPassword(password);
      userDAO.update(user);
      return user;
    } else return null;
  }

  public User findByEmail(String email) {
    User userToFind =
        userDAO.getAll().stream()
            .filter(user -> email.equals(user.getEmailAddress()))
            .findAny()
            .orElse(null);
    return userToFind;
  }

  public User findByEmailAndPassword(String email, String password) {
    User userToFind =
        userDAO.getAll().stream()
            .filter(
                user -> email.equals(user.getEmailAddress()) && password.equals(user.getPassword()))
            .findAny()
            .orElse(null);
    return userToFind;
  }
}
