package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Basket class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Basket implements Serializable {
  private List<VinylRecord> products;
  private float totalPrice;

  /**
   * <p>Getter for the field <code>products</code>.</p>
   *
   * @return a {@link java.util.List} object
   */
  public List<VinylRecord> getProducts() {
    return products;
  }

  /**
   * <p>Setter for the field <code>products</code>.</p>
   *
   * @param products a {@link java.util.List} object
   */
  public void setProducts(List<VinylRecord> products) {
    this.products = products;
  }

  /**
   * <p>Getter for the field <code>totalPrice</code>.</p>
   *
   * @return a float
   */
  public float getTotalPrice() {
    return totalPrice;
  }

  /**
   * <p>Setter for the field <code>totalPrice</code>.</p>
   *
   * @param totalPrice a float
   */
  public void setTotalPrice(float totalPrice) {
    this.totalPrice = totalPrice;
  }
}
