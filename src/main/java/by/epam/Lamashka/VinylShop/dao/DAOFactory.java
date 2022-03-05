package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.entity.Song;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;
import by.epam.Lamashka.VinylShop.entity.VinylRecord;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;

/**
 * <p>DAOFactory class.</p>
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

  private DAOFactory() {}

  /**
   * <p>Getter for the field <code>instance</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.DAOFactory} object
   */
  public static DAOFactory getInstance() {
    return instance;
  }

  /**
   * <p>Getter for the field <code>userDAO</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.UserDAO} object
   */
  public UserDAO getUserDAO() {
    return userDAO;
  }

  /**
   * <p>Getter for the field <code>vinylProductDAO</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.DAO} object
   */
  public DAO<VinylProduct> getVinylProductDAO() {
    return vinylProductDAO;
  }

  /**
   * <p>Getter for the field <code>songDAO</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.DAO} object
   */
  public DAO<Song> getSongDAO() {
    return songDAO;
  }

  /**
   * <p>Getter for the field <code>vinylRecordDAO</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.dao.DAO} object
   */
  public DAO<VinylRecord> getVinylRecordDAO() {
    return vinylRecordDAO;
  }
}
