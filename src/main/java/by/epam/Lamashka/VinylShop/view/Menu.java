package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Controller;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Menu extends View {
  private static final Controller controller = new Controller();

  public Menu() {
    options = new String[] {"1-LOGIN", "2-REGISTER", "0-EXIT"};
  }

  @Override
  public View show() {
    ViewProvider viewProvider = new ViewProvider();
    Integer option = userOptionsInput();
    View view = viewProvider.getView(option);
    while (view != null) {
      view = view.show();
    }
    return null;
  }

  @Override
  protected String userDataInput() {
    return null;
  }
}
