package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.VinylRecord;

import java.util.Collection;
import java.util.List;

/**
 * VinylRecordDAO class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class VinylRecordDAO implements DAO<VinylRecord> {
  private static final List<VinylRecord> vinylRecords = DataSource.getInstance().getVinylRecords();

  /** {@inheritDoc} */
  @Override
  public void update(VinylRecord vinylRecord) {
    vinylRecords.set(vinylRecords.indexOf(vinylRecord), vinylRecord);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(VinylRecord vinylRecord) {
    vinylRecords.remove(vinylRecord);
  }

  /** {@inheritDoc} */
  @Override
  public void save(VinylRecord vinylRecord) {
    vinylRecords.add(vinylRecord);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<VinylRecord> getAll() {
    return vinylRecords;
  }

  /** {@inheritDoc} */
  @Override
  public VinylRecord get(int id) {
    return vinylRecords.get(id);
  }
}
