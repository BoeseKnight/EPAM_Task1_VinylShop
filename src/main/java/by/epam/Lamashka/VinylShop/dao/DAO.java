package by.epam.Lamashka.VinylShop.dao;

import java.util.Collection;

public interface DAO<T> {
  void update(T t);

  void delete(T t);

  void save(T t);

  Collection<T> getAll();

  T get(int id);
}
