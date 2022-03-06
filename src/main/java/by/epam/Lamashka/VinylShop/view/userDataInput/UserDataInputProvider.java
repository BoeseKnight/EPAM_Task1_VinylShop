package by.epam.Lamashka.VinylShop.view.userDataInput;

import java.util.HashMap;
import java.util.Map;

public class UserDataInputProvider {
  private Map<Integer, UserDataInput> userDataInputMap = new HashMap<>();

  public UserDataInputProvider() {
    userDataInputMap.put(1, new AuthorizationInput());
    userDataInputMap.put(2, new AuthorizationInput());
    userDataInputMap.put(3, new PasswordChangeInput());
    userDataInputMap.put(4, new EmailChangeInput());
    userDataInputMap.put(6, new ProductChoiceInput());

  }

  public UserDataInput getUserDataInput(Integer parameters) {
    return userDataInputMap.get(parameters);
  }
}
