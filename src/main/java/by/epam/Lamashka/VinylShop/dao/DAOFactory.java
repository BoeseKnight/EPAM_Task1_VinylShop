package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.entity.Song;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;
import by.epam.Lamashka.VinylShop.entity.VinylRecord;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;

public class DAOFactory {
  private static final DAOFactory instance = new DAOFactory();
  private final DAO<User> userDAO = new UserDAO();
  private final DAO<Song> songDAO = new SongDAO();
  private final DAO<VinylRecord> vinylRecordDAO = new VinylRecordDAO();
  private final DAO<VinylProduct> vinylProductDAO = new VinylProductDAO();

  private DAOFactory() {}

  public static DAOFactory getInstance() {
    return instance;
  }

  public DAO<User> getUserDAO() {
    return userDAO;
  }

  public DAO<VinylProduct> getVinylProductDAO() {
    return vinylProductDAO;
  }

  public DAO<Song> getSongDAO() {
    return songDAO;
  }

  public DAO<VinylRecord> getVinylRecordDAO() {
    return vinylRecordDAO;
  }
}
