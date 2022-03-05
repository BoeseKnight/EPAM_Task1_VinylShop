package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;

import java.util.Collection;
import java.util.List;

/**
 * <p>VinylProductDAO class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class VinylProductDAO implements DAO<VinylProduct> {
  private static final List<VinylProduct> vinylProducts =
      DataSource.getInstance().getVinylProducts();

  /** {@inheritDoc} */
  @Override
  public void update(VinylProduct vinylProduct) {
    vinylProducts.set(vinylProduct.getId(), vinylProduct);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(VinylProduct vinylProduct) {
    vinylProducts.remove(vinylProduct);
  }

  /** {@inheritDoc} */
  @Override
  public void save(VinylProduct vinylProduct) {
    vinylProducts.add(vinylProduct);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<VinylProduct> getAll() {
    return vinylProducts;
  }

  /** {@inheritDoc} */
  @Override
  public VinylProduct get(int id) {
    return vinylProducts.get(id);
  }
}
