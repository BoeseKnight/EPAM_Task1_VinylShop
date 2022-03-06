package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Customer class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Customer extends User implements Serializable {
  private static final AtomicInteger count = new AtomicInteger(0);
  private Address address;
  private final Basket basket =new Basket();
  private List<Order> orders;
  private String firstName;
  private String lastName;
  private String mobilePhone;

  /**
   * Constructor for Customer.
   *
   * @param password a {@link java.lang.String} object
   * @param emailAddress a {@link java.lang.String} object
   * @param address a {@link by.epam.Lamashka.VinylShop.entity.Address} object
   * @param basket a {@link by.epam.Lamashka.VinylShop.entity.Basket} object
   * @param orders a {@link java.util.List} object
   * @param firstName a {@link java.lang.String} object
   * @param lastName a {@link java.lang.String} object
   * @param mobilePhone a {@link java.lang.String} object
   */
  public Customer(
      String emailAddress,
      String password,
      Address address,
      List<Order> orders,
      String firstName,
      String lastName,
      String mobilePhone) {
    super(emailAddress, password);
    this.address = address;
    this.orders = orders;
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobilePhone = mobilePhone;
  }

  public Customer(String emailAddress, String password) {
    super(emailAddress, password);
  }

  public static AtomicInteger getCount() {
    return count;
  }

  /**
   * Getter for the field <code>address</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.Address} object
   */
  public Address getAddress() {
    return address;
  }

  /**
   * Setter for the field <code>address</code>.
   *
   * @param address a {@link by.epam.Lamashka.VinylShop.entity.Address} object
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * Getter for the field <code>basket</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.Basket} object
   */
  public Basket getBasket() {
    return basket;
  }

  /**
   * Getter for the field <code>orders</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Order> getOrders() {
    return orders;
  }

  /**
   * Setter for the field <code>orders</code>.
   *
   * @param orders a {@link java.util.List} object
   */
  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  /**
   * Getter for the field <code>firstName</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter for the field <code>firstName</code>.
   *
   * @param firstName a {@link java.lang.String} object
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter for the field <code>lastName</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter for the field <code>lastName</code>.
   *
   * @param lastName a {@link java.lang.String} object
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter for the field <code>mobilePhone</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMobilePhone() {
    return mobilePhone;
  }

  /**
   * Setter for the field <code>mobilePhone</code>.
   *
   * @param mobilePhone a {@link java.lang.String} object
   */
  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }
}
