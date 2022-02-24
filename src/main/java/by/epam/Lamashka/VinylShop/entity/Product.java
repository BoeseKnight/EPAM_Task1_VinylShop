package by.epam.Lamashka.VinylShop.entity;

public class Product {
  protected int productQuantity;
  protected float price;
  protected String productCode;
  protected String description;

  public Product() {}

  public Product(int productQuantity, float price, String productCode, String description) {
    this.productQuantity = productQuantity;
    this.price = price;
    this.productCode = productCode;
    this.description = description;
  }

  public int getProductQuantity() {
    return productQuantity;
  }

  public void setProductQuantity(int productQuantity) {
    this.productQuantity = productQuantity;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

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
