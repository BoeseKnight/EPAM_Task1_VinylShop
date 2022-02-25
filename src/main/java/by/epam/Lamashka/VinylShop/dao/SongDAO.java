package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.Song;
import by.epam.Lamashka.VinylShop.entity.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SongDAO implements DAO<Song> {
  private static final List<Song> songs = DataSource.getInstanse().getSongs();

  @Override
  public void update(Song song) {
    songs.set(songs.indexOf(song), song);
  }

  @Override
  public void delete(Song song) {
    songs.remove(song);
  }

  @Override
  public void save(Song song) {
    songs.add(song);
  }

  @Override
  public Collection<Song> getAll() {
    return songs;
  }

  @Override
  public Song get(int id) {
    return songs.get(id);
  }
}
