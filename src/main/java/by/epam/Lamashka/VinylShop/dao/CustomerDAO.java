package by.epam.Lamashka.VinylShop.dao;

import by.epam.Lamashka.VinylShop.DataSource;
import by.epam.Lamashka.VinylShop.entity.Customer;

import java.util.Collection;
import java.util.List;

public class CustomerDAO implements DAO<Customer> {
  private final List<Customer> customers = DataSource.getInstance().getCustomers();

  @Override
  public void update(Customer customer) {
    customers.set(customers.indexOf(customer), customer);
  }

  @Override
  public void delete(Customer customer) {
    customers.remove(customer);
  }

  @Override
  public void save(Customer customer) {
    customers.add(customer);
  }

  @Override
  public Collection<Customer> getAll() {
    return customers;
  }

  @Override
  public Customer get(int id) {
    return customers.get(id);
  }

  public Customer findByEmail(String email) {
    Customer customerToFind =
        customers.stream()
            .filter(user -> email.equals(user.getEmailAddress()))
            .findAny()
            .orElse(null);
    return customerToFind;
  }
}
