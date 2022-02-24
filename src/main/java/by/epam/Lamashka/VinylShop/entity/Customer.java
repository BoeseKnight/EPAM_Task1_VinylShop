package by.epam.Lamashka.VinylShop.entity;

import java.util.List;

public class Customer extends User {
  private Address address;
  private Basket basket;
  private List<Order> orders;
  private String firstName;
  private String lastName;
  private String mobilePhone;

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

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Basket getBasket() {
    return basket;
  }

  public void setBasket(Basket basket) {
    this.basket = basket;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }
}
