package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.dao.DAO;
import by.epam.Lamashka.VinylShop.dao.SongDAO;
import by.epam.Lamashka.VinylShop.entity.Song;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductsInitializer implements Initializer {
  @Override
  public void initialize() throws FileNotFoundException {
    DAO<Song> songs = new SongDAO();
    Scanner in = new Scanner(new File("Products.txt"));
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
