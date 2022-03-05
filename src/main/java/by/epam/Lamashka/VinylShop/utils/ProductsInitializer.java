package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.dao.DAO;
import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.dao.SongDAO;
import by.epam.Lamashka.VinylShop.entity.Song;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <p>ProductsInitializer class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class ProductsInitializer implements Initializer {
  /** {@inheritDoc} */
  @Override
  public void initialize() {
    DAO<Song> songs = DAOFactory.getInstance().getSongDAO();
    Scanner in = null;
    try {
      in = new Scanner(new File("Products.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    in.useDelimiter("-|\\r?\\n");
    String name;
    String artist;
    String duration;
    while (in.hasNext()) {
      name = in.next();
      artist = in.next();
      duration = in.next();
      songs.save(new Song(name, artist, duration));
    }
    for (Song song : songs.getAll()) {
      System.out.println(song);
    }
  }
}
