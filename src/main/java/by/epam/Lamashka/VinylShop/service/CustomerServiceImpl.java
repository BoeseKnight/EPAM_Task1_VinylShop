package by.epam.Lamashka.VinylShop.service;

import by.epam.Lamashka.VinylShop.dao.CustomerDAO;
import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.entity.Basket;
import by.epam.Lamashka.VinylShop.entity.Customer;
import by.epam.Lamashka.VinylShop.entity.VinylProduct;

public class CustomerServiceImpl implements CustomerService {
  private CustomerDAO customerDAO = DAOFactory.getInstance().getCustomerDAO();

  @Override
  public boolean addProductToBasket(Customer customer, VinylProduct vinylProduct) {
    if (vinylProduct == null) {
      return false;
    }
    Basket basket = customer.getBasket();
    basket.getProducts().add(vinylProduct);
    return true;
  }

  @Override
  public Customer register(String email, String password) {
    Customer customerToFind = customerDAO.findByEmail(email);
    if (customerToFind != null) {
      return customerToFind;
    } else {
      Customer customer = new Customer(email, password);
      customerDAO.save(customer);
      return customer;
    }
  }
}
