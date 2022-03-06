package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.dao.DAO;
import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.dao.SongDAO;
import by.epam.Lamashka.VinylShop.entity.Song;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;
import by.epam.Lamashka.VinylShop.entity.VinylRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ProductsInitializer class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class ProductsInitializer implements Initializer {
  /** {@inheritDoc} */
  @Override
  public void initialize() {
    DAO<Song> songDAO = DAOFactory.getInstance().getSongDAO();
    DAO<VinylRecord> vinylRecordDAO = DAOFactory.getInstance().getVinylRecordDAO();
    DAO<VinylProduct> vinylProductDAO = DAOFactory.getInstance().getVinylProductDAO();

    Scanner in = null;
    try {
      in = new Scanner(new File("Products.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    in.useDelimiter("-|\\r?\\n");
    while (in.hasNext()) {
      VinylProduct vinylProduct;
      in.next();
      while (!in.hasNext("</VinylProduct>") ) {
        List<VinylRecord> vinylRecordList=new ArrayList<>();
        in.next();
        while (!in.hasNext("</VinylRecord>")) {
          List<Song> songsFromFile = new ArrayList<>();
          in.next();
          while (!in.hasNext("</Songs>")) {
            String name = in.next();
            String artist = in.next();
            String duration = in.next();
            Song song = new Song(name, artist, duration);
            songsFromFile.add(song);
            songDAO.save(song);
          }
          in.next();
          String vinylRecordArtist = in.next();
          String album = in.next();
          String genre = in.next();
          String releaseDate = in.next();
          VinylRecord vinylRecord =
              new VinylRecord(songsFromFile, vinylRecordArtist, album, genre, releaseDate);
          vinylRecordList.add(vinylRecord);
          vinylRecordDAO.save(vinylRecord);
        }
        in.next();
        vinylProduct = new VinylProduct(vinylRecordList);
        vinylProductDAO.save(vinylProduct);
      }
      in.next();
    }
    for (VinylProduct product : vinylProductDAO.getAll()) {
      System.out.println(product);
    }
  }
}
