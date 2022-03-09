package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * CustomerView class.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class CustomerView extends View {
  private Logger logger = LogManager.getLogger(CustomerView.class);

  /** Constructor for CustomerView. */
  public CustomerView() {
    options =
        new String[] {
          "1-PASSWORD CHANGE",
          "2-EMAIL CHANGE",
          "3-SEE ALL PRODUCTS",
          "4-ADD PRODUCT TO BASKET",
          "5-DELETE PRODUCT FROM BASKET",
          "6-CHECKOUT",
          "0-EXIT"
        };
  }

  /** {@inheritDoc} */
  @Override
  public View show() {
    String commandParameters = "";
    logger.info("Customer menu");
    Integer option = userOptionsInput();
    if (option != 0) {
      if (option == 1 || option == 2 || option == 4) {
        commandParameters = userDataInput(option + 2);
      }
      response = controller.executeCommand(CommandName.values()[option + 1], commandParameters);
      logger.info(response.getKey());
      return response.getValue();
    } else return null;
  }
}
