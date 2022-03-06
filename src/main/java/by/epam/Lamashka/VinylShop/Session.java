package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.entity.User;

/**
 * <p>Session class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Session {
  private static final Session instance = new Session();
  private User user;

  private Session() {
    user = null;
  }

  /**
   * <p>Getter for the field <code>instance</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.Session} object
   */
  public static Session getInstance() {
    return instance;
  }

  /**
   * <p>Getter for the field <code>user</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  public User getUser() {
    return user;
  }
  /**
   * <p>Setter for the field <code>user</code>.</p>
   *
   * @param user a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  public void setUser(User user){
    this.user=user;
  }
}
