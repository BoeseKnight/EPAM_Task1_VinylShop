package by.epam.Lamashka.VinylShop.service;

import by.epam.Lamashka.VinylShop.dao.DAO;
import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class VinylProductServiceImpl implements VinylProductService {
  private final DAO<VinylProduct> vinylProductDAO = DAOFactory.getInstance().getVinylProductDAO();

  @Override
  public Collection<VinylProduct> productsSort() {
    Comparator<VinylProduct> comparator =
        Comparator.comparing(obj -> obj.getVinylRecords().get(0).getArtist());
    Collections.sort((ArrayList<VinylProduct>) vinylProductDAO.getAll(), comparator);
    return vinylProductDAO.getAll();
  }

  @Override
  public VinylProduct getProduct(int id) {
    return vinylProductDAO.get(id - 1);
  }
}
