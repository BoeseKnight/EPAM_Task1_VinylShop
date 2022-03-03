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

public class UserService {
  private static final UserDAO userDAO = DAOFactory.getInstance().getUserDAO();

  public User login(String email, String password) {
    User user = userDAO.findByEmailAndPassword(email, password);
    return user;
  }

  public User register(String email, String password) {
    User user = userDAO.findByEmail(email);
    if (user != null) {
      return null;
    } else {
      userDAO.save(new User(email, password));
      return userDAO.get(userDAO.getAll().size() - 1);
    }
  }

  public User changePassword(String email, String password) {
    User user = userDAO.findByEmail(email);
    if (user != null) {
      user.setPassword(password);
      userDAO.update(user);
      return user;
    } else return null;
  }

  public User changeEmail(String oldEmail, String password, String newEmail) {
    User user = userDAO.findByEmail(oldEmail);
    if (userDAO.findByEmail(newEmail) == null) {
      user.setEmailAddress(newEmail);
      userDAO.update(user);
      return user;
    }
    else return null;

  }

  public Collection<User> usersSort() {
    Collections.sort((ArrayList<User>) userDAO.getAll());
    return userDAO.getAll();
  }
}
