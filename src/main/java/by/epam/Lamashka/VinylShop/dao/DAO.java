package by.epam.Lamashka.VinylShop.dao;

import java.util.Collection;

/**
 * <p>DAO interface.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public interface DAO<T> {
  /**
   * <p>update.</p>
   *
   * @param t a T object
   */
  void update(T t);

  /**
   * <p>delete.</p>
   *
   * @param t a T object
   */
  void delete(T t);

  /**
   * <p>save.</p>
   *
   * @param t a T object
   */
  void save(T t);

  /**
   * <p>getAll.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  Collection<T> getAll();

  /**
   * <p>get.</p>
   *
   * @param id a int
   * @return a T object
   */
  T get(int id);
}
