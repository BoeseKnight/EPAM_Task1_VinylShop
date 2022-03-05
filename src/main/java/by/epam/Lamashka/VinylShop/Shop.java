package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.entity.User;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable {
  private static final long serialVersionUID = 1L;
  private List<User> users;

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public List<User> getUsers() {
    return users;
  }

  @Override
  public String toString() {
    return "Shop{" + "users=" + users + '}';
  }
}
