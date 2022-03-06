package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.Order;

import java.util.Collection;
import java.util.List;

public class OrderDAO implements DAO<Order> {
  private final List<Order> orders = DataSource.getInstance().getOrders();

  @Override
  public void update(Order order) {
    orders.set(orders.indexOf(order), order);
  }

  @Override
  public void delete(Order order) {
    orders.remove(order);
  }

  @Override
  public void save(Order order) {
    orders.add(order);
  }

  @Override
  public Collection<Order> getAll() {
    return orders;
  }

  @Override
  public Order get(int id) {
    return orders.get(id);
  }
}
