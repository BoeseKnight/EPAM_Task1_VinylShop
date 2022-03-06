package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Order class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Order implements Serializable {
  private static final AtomicInteger count = new AtomicInteger(0);
  private String orderNumber;
  private String orderDate;
  private OrderStatus orderStatus;
  private float sum;

  public static AtomicInteger getCount() {
    return count;
  }
  /**
   * Getter for the field <code>orderNumber</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrderNumber() {
    return orderNumber;
  }

  /**
   * Setter for the field <code>orderNumber</code>.
   *
   * @param orderNumber a {@link java.lang.String} object
   */
  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  /**
   * Getter for the field <code>orderDate</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrderDate() {
    return orderDate;
  }

  /**
   * Setter for the field <code>orderDate</code>.
   *
   * @param orderDate a {@link java.lang.String} object
   */
  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  /**
   * Getter for the field <code>orderStatus</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.entity.OrderStatus} object
   */
  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  /**
   * Setter for the field <code>orderStatus</code>.
   *
   * @param orderStatus a {@link by.epam.Lamashka.VinylShop.entity.OrderStatus} object
   */
  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  /**
   * Getter for the field <code>sum</code>.
   *
   * @return a float
   */
  public float getSum() {
    return sum;
  }

  /**
   * Setter for the field <code>sum</code>.
   *
   * @param sum a float
   */
  public void setSum(float sum) {
    this.sum = sum;
  }
}
