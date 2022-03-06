package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Basket class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Basket implements Serializable {
  private static final AtomicInteger count = new AtomicInteger(0);
  private final List<VinylProduct> products =new ArrayList<>();
  private float totalPrice;

  public static AtomicInteger getCount() {
    return count;
  }
  /**
   * Getter for the field <code>products</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<VinylProduct> getProducts() {
    return products;
  }


  /**
   * Getter for the field <code>totalPrice</code>.
   *
   * @return a float
   */
  public float getTotalPrice() {
    return totalPrice;
  }

  /**
   * Setter for the field <code>totalPrice</code>.
   *
   * @param totalPrice a float
   */
  public void setTotalPrice(float totalPrice) {
    this.totalPrice = totalPrice;
  }

  @Override
  public String toString() {
    return "Basket{" +
            "products=" + products +
            ", totalPrice=" + totalPrice +
            '}';
  }
}
