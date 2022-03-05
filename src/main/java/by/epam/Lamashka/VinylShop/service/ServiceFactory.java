package by.epam.Lamashka.VinylShop.service;

/**
 * <p>ServiceFactory class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class ServiceFactory {
  private static final ServiceFactory instance = new ServiceFactory();
  private final UserService userService = new UserService();

  private ServiceFactory() {}

  /**
   * <p>Getter for the field <code>instance</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.service.ServiceFactory} object
   */
  public static ServiceFactory getInstance() {
    return instance;
  }

  /**
   * <p>Getter for the field <code>userService</code>.</p>
   *
   * @return a {@link by.epam.Lamashka.VinylShop.service.UserService} object
   */
  public UserService getUserService() {
    return userService;
  }
}
