package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;

public class Session {
  private static final Session instance = new Session();
  private User user;

  private Session() {
    user = null;
  }

  public static Session getInstance() {
    return instance;
  }

  public User getUser() {
    return user;
  }
  public void setUser(User user){
    this.user=user;
  }
}
