package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;

/**
 * <p>Order class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Order implements Serializable {
  private String orderNumber;
  private String orderDate;
  private OrderStatus orderStatus;
  private float sum;

  /**
   * <p>Getter for the field <code>orderNumber</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrderNumber() {
    return orderNumber;
  }

  /**
   * <p>Setter for the field <code>orderNumber</code>.</p>
   *
   * @param orderNumber a {@link java.lang.String} object
   */
  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  /**
   * <p>Getter for the field <code>orderDate</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrderDate() {
    return orderDate;
  }

  /**
   * <p>Setter for the field <code>orderDate</code>.</p>
   *
   * @param orderDate a {@link java.lang.String} object
   */
  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  /**
   * <p>Getter for the field <code>orderStatus</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.OrderStatus} object
   */
  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  /**
   * <p>Setter for the field <code>orderStatus</code>.</p>
   *
   * @param orderStatus a {@link by.epam.Lamashka.VinylShop.entity.OrderStatus} object
   */
  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  /**
   * <p>Getter for the field <code>sum</code>.</p>
   *
   * @return a float
   */
  public float getSum() {
    return sum;
  }

  /**
   * <p>Setter for the field <code>sum</code>.</p>
   *
   * @param sum a float
   */
  public void setSum(float sum) {
    this.sum = sum;
  }
}
