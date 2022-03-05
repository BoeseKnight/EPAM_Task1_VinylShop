package by.epam.Lamashka.VinylShop.view;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>ViewProvider class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class ViewProvider {
  private Map<Integer, View> views = new HashMap<>();

  /**
   * <p>Constructor for ViewProvider.</p>
   */
  public ViewProvider() {
    views.put(0, null);
    views.put(1, new AuthorizationView());
    views.put(2, new RegistrationView());
    views.put(3, new CustomerView());
    views.put(4, new AdminView());
  }

  /**
   * <p>getView.</p>
   *
   * @param option a {@link java.lang.Integer} object
   * @return a {@link by.epam.Lamashka.VinylShop.view.View} object
   */
  public View getView(Integer option) {
    return views.get(option);
  }
}
