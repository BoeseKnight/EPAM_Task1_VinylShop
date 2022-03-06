package by.epam.Lamashka.VinylShop.service;

/**
 * ServiceFactory class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public class ServiceFactory {
  private static final ServiceFactory instance = new ServiceFactory();
  private final UserService userServiceImpl = new UserServiceImpl();
  private final VinylProductService vinylProductService = new VinylProductServiceImpl();
  private final CustomerService customerService=new CustomerServiceImpl();

  private ServiceFactory() {}

  /**
   * Getter for the field <code>instance</code>.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.service.ServiceFactory} object
   */
  public static ServiceFactory getInstance() {
    return instance;
  }

  /**
   * Getter for the field <code>userService</code>.
   *
   * @return a {@link UserServiceImpl} object
   */
  public UserService getUserService() {
    return userServiceImpl;
  }

  public VinylProductService getVinylProductService() {
    return vinylProductService;
  }

  public CustomerService getCustomerService() {
    return customerService;
  }
}
