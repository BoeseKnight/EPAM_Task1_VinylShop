package by.epam.Lamashka.VinylShop.entity;

import java.util.List;

public class Basket {
  private List<VinylRecord> products;
  private float totalPrice;

  public List<VinylRecord> getProducts() {
    return products;
  }

  public void setProducts(List<VinylRecord> products) {
    this.products = products;
  }

  public float getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(float totalPrice) {
    this.totalPrice = totalPrice;
  }
}
