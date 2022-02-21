package by.epam.Lamashka.VinylShop.DAO;

import by.epam.Lamashka.VinylShop.Entitiy.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDAO implements DAO<User> {
  private static final List<User> users = new ArrayList<>();

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
}
