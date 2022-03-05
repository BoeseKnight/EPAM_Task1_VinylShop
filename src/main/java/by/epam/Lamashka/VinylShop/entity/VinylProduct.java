package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.List;

/**
 * <p>VinylProduct class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class VinylProduct extends Product implements Serializable {
  private List<VinylRecord> vinylRecords;
  private int vinylRecordsQuantity;
  private int id;

  /**
   * <p>Constructor for VinylProduct.</p>
   */
  public VinylProduct() {}

  /**
   * <p>Constructor for VinylProduct.</p>
   *
   * @param vinylRecords a {@link java.util.List} object
   * @param vinylRecordsQuantity a int
   */
  public VinylProduct(List<VinylRecord> vinylRecords, int vinylRecordsQuantity) {
    this.vinylRecords = vinylRecords;
    this.vinylRecordsQuantity = vinylRecordsQuantity;
  }

  /**
   * <p>Constructor for VinylProduct.</p>
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
    this.vinylRecordsQuantity = vinylRecordsQuantity;
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

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a int
   */
  public int getId() {
    return id;
  }
}
