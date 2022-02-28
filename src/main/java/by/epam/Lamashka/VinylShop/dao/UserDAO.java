package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.User;

import java.util.Collection;
import java.util.List;

public class UserDAO implements DAO<User> {
  private static final List<User> users = DataSource.getInstance().getUsers();

  @Override
  public void update(User user) {
    users.set(users.indexOf(user), user);
  }

  @Override
  public void delete(User user) {
    users.remove(user);
  }

  @Override
  public void save(User user) {
    users.add(user);
  }

  @Override
  public Collection<User> getAll() {
    return users;
  }

  @Override
  public User get(int id) {
    return users.get(id);
  }

  public User findByEmail(String email) {
    User userToFind =
        users.stream().filter(user -> email.equals(user.getEmailAddress())).findAny().orElse(null);
    return userToFind;
  }

  public User findByEmailAndPassword(String email, String password) {
    User userToFind =
        users.stream()
            .filter(
                user -> email.equals(user.getEmailAddress()) && password.equals(user.getPassword()))
            .findAny()
            .orElse(null);
    return userToFind;
  }
}
