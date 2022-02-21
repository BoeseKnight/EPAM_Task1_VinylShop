package by.epam.Lamashka.VinylShop.DAO;

import by.epam.Lamashka.VinylShop.Entitiy.Song;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SongDAO implements DAO<Song> {
  private List<Song> songs = new ArrayList<>();

  @Override
  public void update(Song song) {
    songs.set(song.getId(), song);
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
