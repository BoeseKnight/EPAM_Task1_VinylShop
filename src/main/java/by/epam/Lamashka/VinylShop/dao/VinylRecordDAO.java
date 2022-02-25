package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.VinylRecord;

import java.util.Collection;
import java.util.List;

public class VinylRecordDAO implements DAO<VinylRecord> {
  private static final List<VinylRecord> vinylRecords = DataSource.getInstance().getVinylRecords();

  @Override
  public void update(VinylRecord vinylRecord) {
    vinylRecords.set(vinylRecord.getId(), vinylRecord);
  }

  @Override
  public void delete(VinylRecord vinylRecord) {
    vinylRecords.remove(vinylRecord);
  }

  @Override
  public void save(VinylRecord vinylRecord) {
    vinylRecords.add(vinylRecord);
  }

  @Override
  public Collection<VinylRecord> getAll() {
    return vinylRecords;
  }

  @Override
  public VinylRecord get(int id) {
    return vinylRecords.get(id);
  }
}
