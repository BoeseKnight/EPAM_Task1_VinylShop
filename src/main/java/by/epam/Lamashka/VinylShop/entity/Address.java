package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;

/**
 * <p>Address class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Address implements Serializable {
  private String addressLine;
  private String postcode;
  private String country;
  private String city;

  /**
   * <p>Getter for the field <code>addressLine</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAddressLine() {
    return addressLine;
  }

  /**
   * <p>Setter for the field <code>addressLine</code>.</p>
   *
   * @param addressLine a {@link java.lang.String} object
   */
  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  /**
   * <p>Getter for the field <code>postcode</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPostcode() {
    return postcode;
  }

  /**
   * <p>Setter for the field <code>postcode</code>.</p>
   *
   * @param postcode a {@link java.lang.String} object
   */
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   * <p>Getter for the field <code>country</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCountry() {
    return country;
  }

  /**
   * <p>Setter for the field <code>country</code>.</p>
   *
   * @param country a {@link java.lang.String} object
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * <p>Getter for the field <code>city</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCity() {
    return city;
  }

  /**
   * <p>Setter for the field <code>city</code>.</p>
   *
   * @param city a {@link java.lang.String} object
   */
  public void setCity(String city) {
    this.city = city;
  }
}
