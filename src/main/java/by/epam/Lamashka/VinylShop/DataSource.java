package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DataSource class.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class DataSource {

  private static final DataSource instance = new DataSource();
  private final List<User> users = new ArrayList<>();
  private final List<Song> songs = new ArrayList<>();
  private final List<VinylRecord> vinylRecords = new ArrayList<>();
  private final List<VinylProduct> vinylProducts = new ArrayList<>();
  private final List<Order> orders = new ArrayList<>();
  private final List<Customer> customers = new ArrayList<>();
  private final Map<String, Basket> baskets = new HashMap<>();

  private DataSource() {}

  /**
   * Getter for the field <code>instance</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.DataSource} object
   */
  public static DataSource getInstance() {
    return instance;
  }

  /**
   * Getter for the field <code>songs</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Song> getSongs() {
    return songs;
  }

  /**
   * Getter for the field <code>users</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<User> getUsers() {
    return users;
  }

  /**
   * Getter for the field <code>orders</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Order> getOrders() {
    return orders;
  }

  /**
   * Getter for the field <code>vinylRecords</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<VinylRecord> getVinylRecords() {
    return vinylRecords;
  }

  /**
   * Getter for the field <code>vinylProducts</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<VinylProduct> getVinylProducts() {
    return vinylProducts;
  }

  /**
   * Getter for the field <code>baskets</code>.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Basket> getBaskets() {
    return baskets;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  @Override
  public String toString() {
    return "DataSource{"
        + "users="
        + users
        + ", songs="
        + songs
        + ", vinylRecords="
        + vinylRecords
        + ", vinylProducts="
        + vinylProducts
        + ", orders="
        + orders
        + ", baskets="
        + baskets
        + '}';
  }
}
