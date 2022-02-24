package by.epam.Lamashka.VinylShop.entity;

import java.util.List;

public class VinylProduct extends Product {
  private List<VinylRecord> vinylRecords;
  private int vinylRecordsQuantity;
  private int id;

  public VinylProduct() {}

  public VinylProduct(List<VinylRecord> vinylRecords, int vinylRecordsQuantity) {
    this.vinylRecords = vinylRecords;
    this.vinylRecordsQuantity = vinylRecordsQuantity;
  }

  public VinylProduct(
      int productQuantity,
      float price,
      String productCode,
      String description,
      List<VinylRecord> vinylRecords,
      int vinylRecordsQuantity) {
    super(productQuantity, price, productCode, description);
    this.vinylRecords = vinylRecords;
    this.vinylRecordsQuantity = vinylRecordsQuantity;
  }

  @Override
  public String toString() {
    return "VinylProduct{"
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
        + ", vinylRecords="
        + vinylRecords
        + ", vinylRecordsQuantity="
        + vinylRecordsQuantity
        + '}';
  }

  public int getId() {
    return id;
  }
}
