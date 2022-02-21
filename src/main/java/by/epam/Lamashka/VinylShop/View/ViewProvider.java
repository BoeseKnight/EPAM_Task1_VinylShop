package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewProvider {
  private Map<Integer, View> views = new HashMap<>();

  public ViewProvider() {
    views.put(1, new AuthorizationView());
    views.put(2, new RegistrationView());
    views.put(3, new CustomerView());
    views.put(4, new AdminView());
  }

  public View getView(Integer option) {
    return views.get(option);
  }
}
