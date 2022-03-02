package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class User implements Serializable, Comparable<User> {
  private static final AtomicInteger count = new AtomicInteger(0);
  private String password;
  private String emailAddress;

  @Override
  public int compareTo(User o) {
    return password.compareTo(o.getEmailAddress());
  }

  private UserRole role;

  public User(String emailAddress, String password) {
    this.password = password;
    this.emailAddress = emailAddress;
    count.incrementAndGet();
  }

  public static AtomicInteger getCount() {
    return count;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UserRole getRole() {
    return role;
  }

  public void setRole(UserRole role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return password.equals(user.password) && emailAddress.equals(user.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, emailAddress);
  }

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
