package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * User class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class User implements Serializable, Comparable<User> {
  private static final AtomicInteger count = new AtomicInteger(0);
  private String emailAddress;
  private String password;
  private UserRole role;

  {
    count.incrementAndGet();
  }
  /** {@inheritDoc} */
  @Override
  public int compareTo(User o) {
    return emailAddress.compareTo(o.getEmailAddress());
  }

  /**
   * Constructor for User.
   *
   * @param emailAddress a {@link java.lang.String} object
   * @param password a {@link java.lang.String} object
   */
  public User(String emailAddress, String password) {
    this.role = UserRole.User;
    this.password = password;
    this.emailAddress = emailAddress;
  }

  /**
   * Constructor for User.
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
   * Getter for the field <code>count</code>.
   *
   * @return a {@link java.util.concurrent.atomic.AtomicInteger} object
   */
  public static AtomicInteger getCount() {
    return count;
  }

  /**
   * Getter for the field <code>password</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPassword() {
    return password;
  }

  /**
   * Setter for the field <code>password</code>.
   *
   * @param password a {@link java.lang.String} object
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Getter for the field <code>emailAddress</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * Setter for the field <code>emailAddress</code>.
   *
   * @param emailAddress a {@link java.lang.String} object
   */
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * Getter for the field <code>role</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.UserRole} object
   */
  public UserRole getRole() {
    return role;
  }

  /**
   * Setter for the field <code>role</code>.
   *
   * @param role a {@link by.epam.Lamashka.VinylShop.entity.UserRole} object
   */
  public void setRole(UserRole role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(emailAddress, user.emailAddress)
        && Objects.equals(password, user.password)
        && role == user.role;
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, password, role);
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
