package by.epam.Lamashka.VinylShop.view;

import java.util.HashMap;
import java.util.Map;

/**
 * ViewProvider class.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class ViewProvider {
  private Map<Integer, View> views = new HashMap<>();

  /** Constructor for ViewProvider. */
  public ViewProvider() {
    views.put(0, null);
    views.put(1, new AuthorizationView());
    views.put(2, new RegistrationView());
  }

  /**
   * getView.
   *
   * @param option a {@link java.lang.Integer} object
   * @return a {@link by.epam.Lamashka.VinylShop.view.View} object
   */
  public View getView(Integer option) {
    return views.get(option);
  }
}
