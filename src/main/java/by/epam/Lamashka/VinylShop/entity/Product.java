package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;

/**
 * <p>Product class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Product implements Serializable {
  protected int productQuantity;
  protected float price;
  protected String productCode;
  protected String description;

  /**
   * <p>Constructor for Product.</p>
   */
  public Product() {}

  /**
   * <p>Constructor for Product.</p>
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

  /**
   * <p>Getter for the field <code>productQuantity</code>.</p>
   *
   * @return a int
   */
  public int getProductQuantity() {
    return productQuantity;
  }

  /**
   * <p>Setter for the field <code>productQuantity</code>.</p>
   *
   * @param productQuantity a int
   */
  public void setProductQuantity(int productQuantity) {
    this.productQuantity = productQuantity;
  }

  /**
   * <p>Getter for the field <code>price</code>.</p>
   *
   * @return a float
   */
  public float getPrice() {
    return price;
  }

  /**
   * <p>Setter for the field <code>price</code>.</p>
   *
   * @param price a float
   */
  public void setPrice(float price) {
    this.price = price;
  }

  /**
   * <p>Getter for the field <code>productCode</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProductCode() {
    return productCode;
  }

  /**
   * <p>Setter for the field <code>productCode</code>.</p>
   *
   * @param productCode a {@link java.lang.String} object
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
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
