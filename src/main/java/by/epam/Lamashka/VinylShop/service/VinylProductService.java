package by.epam.Lamashka.VinylShop.service;

import by.epam.Lamashka.VinylShop.entity.VinylProduct;

import java.util.Collection;

public interface VinylProductService {
  Collection<VinylProduct> productsSort();

  VinylProduct getProduct(int id);
}
