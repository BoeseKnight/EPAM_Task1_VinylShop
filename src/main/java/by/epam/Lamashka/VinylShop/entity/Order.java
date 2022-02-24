package by.epam.Lamashka.VinylShop.entity;

public class Order {
  private String orderNumber;
  private String orderDate;
  private OrderStatus orderStatus;
  private float sum;

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  public float getSum() {
    return sum;
  }

  public void setSum(float sum) {
    this.sum = sum;
  }
}
