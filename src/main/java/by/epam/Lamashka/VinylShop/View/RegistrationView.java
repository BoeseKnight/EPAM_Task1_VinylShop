package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Controller;

public class RegistrationView extends View {
  public RegistrationView() {
    options = new String[] {"1-ENTER LOGIN", "2-ENTER PASSWORD"};
  }

  @Override
  public View show() {
    return null;
  }

  @Override
  protected String userDataInput() {
    return null;
  }
}
