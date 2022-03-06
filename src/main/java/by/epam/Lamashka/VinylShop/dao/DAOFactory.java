package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.entity.Customer;
import by.epam.Lamashka.VinylShop.entity.Song;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;
import by.epam.Lamashka.VinylShop.entity.VinylRecord;

/**
 * DAOFactory class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class DAOFactory {
  private static final DAOFactory instance = new DAOFactory();
  private final UserDAO userDAO = new UserDAO();
  private final DAO<Song> songDAO = new SongDAO();
  private final DAO<VinylRecord> vinylRecordDAO = new VinylRecordDAO();
  private final DAO<VinylProduct> vinylProductDAO = new VinylProductDAO();
  private final CustomerDAO customerDAO = new CustomerDAO();

  private DAOFactory() {}

  /**
   * Getter for the field <code>instance</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.DAOFactory} object
   */
  public static DAOFactory getInstance() {
    return instance;
  }

  /**
   * Getter for the field <code>userDAO</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.UserDAO} object
   */
  public UserDAO getUserDAO() {
    return userDAO;
  }

  /**
   * Getter for the field <code>vinylProductDAO</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.DAO} object
   */
  public DAO<VinylProduct> getVinylProductDAO() {
    return vinylProductDAO;
  }

  /**
   * Getter for the field <code>songDAO</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.DAO} object
   */
  public DAO<Song> getSongDAO() {
    return songDAO;
  }

  /**
   * Getter for the field <code>vinylRecordDAO</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.DAO} object
   */
  public DAO<VinylRecord> getVinylRecordDAO() {
    return vinylRecordDAO;
  }

  public CustomerDAO getCustomerDAO() {
    return customerDAO;
  }
}
