package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Controller;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

/**
 * <p>Menu class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class Menu extends View {
  private static final Controller controller = new Controller();

  /**
   * <p>Constructor for Menu.</p>
   */
  public Menu() {
    options = new String[] {"1-LOGIN", "2-REGISTER", "0-EXIT"};
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  protected String userDataInput() {
    return null;
  }
}
