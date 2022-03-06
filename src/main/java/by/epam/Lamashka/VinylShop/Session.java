package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.entity.Customer;
import by.epam.Lamashka.VinylShop.entity.User;

/**
 * Session class.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class Session {
  private static final Session instance = new Session();
  private User user;
  private Customer customer;
  private Session() {
    user = null;
  }

  /**
   * Getter for the field <code>instance</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.Session} object
   */
  public static Session getInstance() {
    return instance;
  }

  /**
   * Getter for the field <code>user</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  public User getUser() {
    return user;
  }
  /**
   * Setter for the field <code>user</code>.
   *
   * @param user a {@link by.epam.Lamashka.VinylShop.entity.User} object
   */
  public void setUser(User user) {
    this.user = user;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
