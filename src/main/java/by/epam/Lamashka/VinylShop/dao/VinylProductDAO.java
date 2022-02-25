package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VinylProductDAO implements DAO<VinylProduct> {
  private static final List<VinylProduct> vinylProducts = DataSource.getInstanse().getVinylProducts();

  @Override
  public void update(VinylProduct vinylProduct) {
    vinylProducts.set(vinylProduct.getId(), vinylProduct);
  }

  @Override
  public void delete(VinylProduct vinylProduct) {
    vinylProducts.remove(vinylProduct);
  }

  @Override
  public void save(VinylProduct vinylProduct) {
    vinylProducts.add(vinylProduct);
  }

  @Override
  public Collection<VinylProduct> getAll() {
    return vinylProducts;
  }

  @Override
  public VinylProduct get(int id) {
    return vinylProducts.get(id);
  }
}
