package by.epam.Lamashka.VinylShop.dao;

import java.util.Collection;

/**
 * DAO interface.
 *
 * @author Asus
 * @version $Id: $Id
 */
public interface DAO<T> {
  /**
   * update.
   *
   * @param t a T object
   */
  void update(T t);

  /**
   * delete.
   *
   * @param t a T object
   */
  void delete(T t);

  /**
   * save.
   *
   * @param t a T object
   */
  void save(T t);

  /**
   * getAll.
   *
   * @return a {@link java.util.Collection} object
   */
  Collection<T> getAll();

  /**
   * get.
   *
   * @param id a int
   * @return a T object
   */
  T get(int id);
}
