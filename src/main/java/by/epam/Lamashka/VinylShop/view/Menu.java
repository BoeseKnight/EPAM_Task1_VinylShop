package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Controller;

/**
 * Menu class.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class Menu extends View {
  private static final Controller controller = new Controller();

  /** Constructor for Menu. */
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

  @Override
  protected String userDataInput(Integer option) {
    return null;
  }
}
