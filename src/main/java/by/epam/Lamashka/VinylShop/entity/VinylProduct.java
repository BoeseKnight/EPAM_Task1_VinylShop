package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * VinylProduct class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class VinylProduct extends Product implements Serializable {
  private static final AtomicInteger count = new AtomicInteger(0);

  private List<VinylRecord> vinylRecords;
  private int vinylRecordsQuantity;

  {
    count.incrementAndGet();
  }

  /** Constructor for VinylProduct. */
  public VinylProduct() {}

  /**
   * Constructor for VinylProduct.
   *
   * @param vinylRecords a {@link java.util.List} object
   */
  public VinylProduct(List<VinylRecord> vinylRecords) {
    this.vinylRecords = vinylRecords;
    this.vinylRecordsQuantity = vinylRecords.size();
  }

  /**
   * Constructor for VinylProduct.
   *
   * @param productQuantity a int
   * @param price a float
   * @param productCode a {@link java.lang.String} object
   * @param description a {@link java.lang.String} object
   * @param vinylRecords a {@link java.util.List} object
   * @param vinylRecordsQuantity a int
   */
  public VinylProduct(
      int productQuantity,
      float price,
      String productCode,
      String description,
      List<VinylRecord> vinylRecords,
      int vinylRecordsQuantity) {
    super(productQuantity, price, productCode, description);
    this.vinylRecords = vinylRecords;
    this.vinylRecordsQuantity = vinylRecords.size();
  }

  public static AtomicInteger getCount() {
    return count;
  }

  public List<VinylRecord> getVinylRecords() {
    return vinylRecords;
  }

  public void setVinylRecords(List<VinylRecord> vinylRecords) {
    this.vinylRecords = vinylRecords;
  }

  public int getVinylRecordsQuantity() {
    return vinylRecordsQuantity;
  }

  public void setVinylRecordsQuantity(int vinylRecordsQuantity) {
    this.vinylRecordsQuantity = vinylRecordsQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VinylProduct product = (VinylProduct) o;
    return vinylRecordsQuantity == product.vinylRecordsQuantity
        && Objects.equals(vinylRecords, product.vinylRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vinylRecords, vinylRecordsQuantity);
  }

  /** {@inheritDoc} */
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
}
