package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.view.userDataInput.UserDataInputProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * AdminView class.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class AdminView extends View {
  private static Logger logger = LogManager.getLogger(AdminView.class);
  private UserDataInputProvider userDataInputProvider = new UserDataInputProvider();
  /** Constructor for AdminView. */
  public AdminView() {
    options =
        new String[] {
          "1-PASSWORD CHANGE",
          "2-EMAIL CHANGE",
          "3-SEE ALL PRODUCTS",
          "4-ADD PRODUCT TO BASKET",
          "5-DELETE PRODUCT FROM BASKET",
          "6-CHECKOUT",
          "7-SEE ALL USERS",
          "8-ADD PRODUCT",
          "9-DELETE PRODUCT",
          "0-EXIT",
        };
  }

  /** {@inheritDoc} */
  @Override
  public View show() {
    String commandParameters = "";
    logger.info("Admin menu");
    Integer option = userOptionsInput();
    if (option != 0) {
      if (option == 1 || option == 2) {
        commandParameters = userDataInput(option);
      }
      response = controller.executeCommand(CommandName.values()[option + 1], commandParameters);
      logger.info(response.getKey());
      return response.getValue();
    } else return null;
  }
}
