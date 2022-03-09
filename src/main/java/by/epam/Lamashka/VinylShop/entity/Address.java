package by.epam.Lamashka.VinylShop.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Address class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Address implements Serializable {
  private String addressLine;
  private String postcode;
  private String country;
  private String city;
  private static final AtomicInteger count = new AtomicInteger(0);

  {
    count.incrementAndGet();
  }

  public static AtomicInteger getCount() {
    return count;
  }
  /**
   * Getter for the field <code>addressLine</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getAddressLine() {
    return addressLine;
  }

  /**
   * Setter for the field <code>addressLine</code>.
   *
   * @param addressLine a {@link java.lang.String} object
   */
  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  /**
   * Getter for the field <code>postcode</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPostcode() {
    return postcode;
  }

  /**
   * Setter for the field <code>postcode</code>.
   *
   * @param postcode a {@link java.lang.String} object
   */
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   * Getter for the field <code>country</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCountry() {
    return country;
  }

  /**
   * Setter for the field <code>country</code>.
   *
   * @param country a {@link java.lang.String} object
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Getter for the field <code>city</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCity() {
    return city;
  }

  /**
   * Setter for the field <code>city</code>.
   *
   * @param city a {@link java.lang.String} object
   */
  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Address address = (Address) o;
    return Objects.equals(addressLine, address.addressLine)
        && Objects.equals(postcode, address.postcode)
        && Objects.equals(country, address.country)
        && Objects.equals(city, address.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, postcode, country, city);
  }

  @Override
  public String toString() {
    return "Address{"
        + "addressLine='"
        + addressLine
        + '\''
        + ", postcode='"
        + postcode
        + '\''
        + ", country='"
        + country
        + '\''
        + ", city='"
        + city
        + '\''
        + '}';
  }
}
