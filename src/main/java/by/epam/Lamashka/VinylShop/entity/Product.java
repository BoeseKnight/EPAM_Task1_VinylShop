package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Product class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Product implements Serializable {
  private static final AtomicInteger count = new AtomicInteger(0);
  protected int productQuantity;
  protected float price;
  protected String productCode;
  protected String description;

  /** Constructor for Product. */
  public Product() {}

  /**
   * Constructor for Product.
   *
   * @param productQuantity a int
   * @param price a float
   * @param productCode a {@link java.lang.String} object
   * @param description a {@link java.lang.String} object
   */
  public Product(int productQuantity, float price, String productCode, String description) {
    this.productQuantity = productQuantity;
    this.price = price;
    this.productCode = productCode;
    this.description = description;
  }

  public static AtomicInteger getCount() {
    return count;
  }
  /**
   * Getter for the field <code>productQuantity</code>.
   *
   * @return a int
   */
  public int getProductQuantity() {
    return productQuantity;
  }

  /**
   * Setter for the field <code>productQuantity</code>.
   *
   * @param productQuantity a int
   */
  public void setProductQuantity(int productQuantity) {
    this.productQuantity = productQuantity;
  }

  /**
   * Getter for the field <code>price</code>.
   *
   * @return a float
   */
  public float getPrice() {
    return price;
  }

  /**
   * Setter for the field <code>price</code>.
   *
   * @param price a float
   */
  public void setPrice(float price) {
    this.price = price;
  }

  /**
   * Getter for the field <code>productCode</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getProductCode() {
    return productCode;
  }

  /**
   * Setter for the field <code>productCode</code>.
   *
   * @param productCode a {@link java.lang.String} object
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  /**
   * Getter for the field <code>description</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * Setter for the field <code>description</code>.
   *
   * @param description a {@link java.lang.String} object
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return "Product{"
        + "productQuantity="
        + productQuantity
        + ", price="
        + price
        + ", productCode='"
        + productCode
        + '\''
        + ", description='"
        + description
        + '\''
        + '}';
  }
}
