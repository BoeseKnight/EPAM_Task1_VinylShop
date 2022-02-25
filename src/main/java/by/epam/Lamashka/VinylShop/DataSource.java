package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSource {
  private static final DataSource instance = new DataSource();
  private final List<User> users = new ArrayList<>();
  private final List<Song> songs = new ArrayList<>();
  private final List<VinylRecord> vinylRecords = new ArrayList<>();
  private final List<VinylProduct> vinylProducts = new ArrayList<>();
  private final List<Order> orders = new ArrayList<>();
  private final Map<String, Basket> baskets = new HashMap<>();

  private DataSource() {}

  public static DataSource getInstance() {
    return instance;
  }

  public List<Song> getSongs() {
    return songs;
  }

  public List<User> getUsers() {
    return users;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public List<VinylRecord> getVinylRecords() {
    return vinylRecords;
  }

  public List<VinylProduct> getVinylProducts() {
    return vinylProducts;
  }

  public Map<String, Basket> getBaskets() {
    return baskets;
  }
}
