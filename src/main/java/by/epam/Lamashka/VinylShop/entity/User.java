package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>User class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class User implements Serializable, Comparable<User> {
  private static final AtomicInteger count = new AtomicInteger(0);
  private String emailAddress;
  private String password;

  /** {@inheritDoc} */
  @Override
  public int compareTo(User o) {
    return emailAddress.compareTo(o.getEmailAddress());
  }

  private UserRole role;

  /**
   * <p>Constructor for User.</p>
   *
   * @param emailAddress a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   */
  public User(String emailAddress, String password) {
    this.role = UserRole.User;
    this.password = password;
    this.emailAddress = emailAddress;
    count.incrementAndGet();
  }

  /**
   * <p>Constructor for User.</p>
   *
   * @param emailAddress a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   * @param role a {@link by.epam.Lamashka.VinylShop.entity.UserRole} object
   */
  public User(String emailAddress, String password, UserRole role) {
    this.password = password;
    this.emailAddress = emailAddress;
    this.role = role;
  }

  /**
   * <p>Getter for the field <code>count</code>.</p>
   *
   * @return a {@link java.util.concurrent.atomic.AtomicInteger} object
   */
  public static AtomicInteger getCount() {
    return count;
  }

  /**
   * <p>Getter for the field <code>password</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPassword() {
    return password;
  }

  /**
   * <p>Setter for the field <code>password</code>.</p>
   *
   * @param password a {@link java.lang.String} object
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * <p>Getter for the field <code>emailAddress</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * <p>Setter for the field <code>emailAddress</code>.</p>
   *
   * @param emailAddress a {@link java.lang.String} object
   */
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * <p>Getter for the field <code>role</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.UserRole} object
   */
  public UserRole getRole() {
    return role;
  }

  /**
   * <p>Setter for the field <code>role</code>.</p>
   *
   * @param role a {@link by.epam.Lamashka.VinylShop.entity.UserRole} object
   */
  public void setRole(UserRole role) {
    this.role = role;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return password.equals(user.password) && emailAddress.equals(user.emailAddress);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(password, emailAddress);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return "User{"
        + ", emailAddress='"
        + emailAddress
        + '\''
        + "password='"
        + password
        + '\''
        + '}';
  }
}
