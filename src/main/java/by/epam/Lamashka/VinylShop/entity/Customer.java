package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Customer class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Customer extends User implements Serializable {
  private Address address;
  private Basket basket;
  private List<Order> orders;
  private String firstName;
  private String lastName;
  private String mobilePhone;

  /**
   * <p>Constructor for Customer.</p>
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
      String password,
      String emailAddress,
      Address address,
      Basket basket,
      List<Order> orders,
      String firstName,
      String lastName,
      String mobilePhone) {
    super(password, emailAddress);
    this.address = address;
    this.basket = basket;
    this.orders = orders;
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobilePhone = mobilePhone;
  }

  /**
   * <p>Getter for the field <code>address</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.Address} object
   */
  public Address getAddress() {
    return address;
  }

  /**
   * <p>Setter for the field <code>address</code>.</p>
   *
   * @param address a {@link by.epam.Lamashka.VinylShop.entity.Address} object
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * <p>Getter for the field <code>basket</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.Basket} object
   */
  public Basket getBasket() {
    return basket;
  }

  /**
   * <p>Setter for the field <code>basket</code>.</p>
   *
   * @param basket a {@link by.epam.Lamashka.VinylShop.entity.Basket} object
   */
  public void setBasket(Basket basket) {
    this.basket = basket;
  }

  /**
   * <p>Getter for the field <code>orders</code>.</p>
   *
   * @return a {@link java.util.List} object
   */
  public List<Order> getOrders() {
    return orders;
  }

  /**
   * <p>Setter for the field <code>orders</code>.</p>
   *
   * @param orders a {@link java.util.List} object
   */
  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  /**
   * <p>Getter for the field <code>firstName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * <p>Setter for the field <code>firstName</code>.</p>
   *
   * @param firstName a {@link java.lang.String} object
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * <p>Getter for the field <code>lastName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * <p>Setter for the field <code>lastName</code>.</p>
   *
   * @param lastName a {@link java.lang.String} object
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * <p>Getter for the field <code>mobilePhone</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMobilePhone() {
    return mobilePhone;
  }

  /**
   * <p>Setter for the field <code>mobilePhone</code>.</p>
   *
   * @param mobilePhone a {@link java.lang.String} object
   */
  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }
}
