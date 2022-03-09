package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;
import by.epam.Lamashka.VinylShop.entity.VinylRecord;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable {
  private static final long serialVersionUID = 1L;
  private List<User> users;
  private List<VinylProduct> vinylProducts;
  private List<VinylRecord> vinylRecords;

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public List<User> getUsers() {
    return users;
  }

  public List<VinylProduct> getVinylProducts() {
    return vinylProducts;
  }

  public void setVinylProducts(List<VinylProduct> vinylProducts) {
    this.vinylProducts = vinylProducts;
  }

  public List<VinylRecord> getVinylRecords() {
    return vinylRecords;
  }

  public void setVinylRecords(List<VinylRecord> vinylRecords) {
    this.vinylRecords = vinylRecords;
  }

  @Override
  public String toString() {
    return "Shop{"
        + "\n"
        + "users="
        + users
        + "\n"
        + "vinylProducts="
        + vinylProducts
        + "\n"
        + "vinylRecords="
        + vinylRecords
        + "\n"
        + '}';
  }
}
