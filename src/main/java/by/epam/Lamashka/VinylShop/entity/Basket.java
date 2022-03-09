package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Basket class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Basket implements Serializable {
  private final List<VinylProduct> products = new ArrayList<>();
  private float totalPrice;
  private static final AtomicInteger count = new AtomicInteger(0);

  {
    count.incrementAndGet();
  }

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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Basket basket = (Basket) o;
    return Float.compare(basket.totalPrice, totalPrice) == 0
        && Objects.equals(products, basket.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, totalPrice);
  }

  @Override
  public String toString() {
    return "Basket{" + "products=" + products + ", totalPrice=" + totalPrice + '}';
  }
}
