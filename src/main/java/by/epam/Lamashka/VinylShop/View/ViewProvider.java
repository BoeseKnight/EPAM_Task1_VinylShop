package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewProvider {
    private Map<String,View> views=new HashMap<>();

    public ViewProvider(Controller controller) {
        views.put("1", new AuthorizationView(controller));
        views.put("2", new RegistrationView(controller));
        views.put("3", new CustomerView(controller));
        views.put("4", new AdminView(controller));
    }
    public View getView(String option){
        return views.get(option);
    }
}
