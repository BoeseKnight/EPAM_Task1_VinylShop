package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.Song;

import java.util.Collection;
import java.util.List;

/**
 * SongDAO class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class SongDAO implements DAO<Song> {
  private static final List<Song> songs = DataSource.getInstance().getSongs();

  /** {@inheritDoc} */
  @Override
  public void update(Song song) {
    songs.set(songs.indexOf(song), song);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(Song song) {
    songs.remove(song);
  }

  /** {@inheritDoc} */
  @Override
  public void save(Song song) {
    songs.add(song);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<Song> getAll() {
    return songs;
  }

  /** {@inheritDoc} */
  @Override
  public Song get(int id) {
    return songs.get(id);
  }
}
