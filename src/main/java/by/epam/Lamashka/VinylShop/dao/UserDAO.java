package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.User;

import java.util.Collection;
import java.util.List;

/**
 * <p>UserDAO class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class UserDAO implements DAO<User> {
  private final List<User> users = DataSource.getInstance().getUsers();

  /** {@inheritDoc} */
  @Override
  public void update(User user) {
    users.set(users.indexOf(user), user);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(User user) {
    users.remove(user);
  }

  /** {@inheritDoc} */
  @Override
  public void save(User user) {
    users.add(user);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<User> getAll() {
    return users;
  }

  /** {@inheritDoc} */
  @Override
  public User get(int id) {
    return users.get(id);
  }

  /**
   * <p>findByEmail.</p>
   *
   * @param email a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  public User findByEmail(String email) {
    User userToFind =
        users.stream().filter(user -> email.equals(user.getEmailAddress())).findAny().orElse(null);
    return userToFind;
  }

  /**
   * <p>findByEmailAndPassword.</p>
   *
   * @param email a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
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
