package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * RegistrationView class.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class RegistrationView extends View {
  /** Constructor for RegistrationView. */
  public RegistrationView() {
    options = new String[] {"1-ENTER LOGIN", "2-ENTER PASSWORD"};
  }

  private static Logger logger = LogManager.getLogger(AuthorizationView.class);

  /** {@inheritDoc} */
  @Override
  public View show() {
    logger.info("REGISTRATION MENU");
    String commandParameters = userDataInput(1);
    response = controller.executeCommand(CommandName.REGISTER, commandParameters);
    logger.info(response.getKey());
    return response.getValue();
  }

  /** {@inheritDoc} */
  @Override
  protected Integer userOptionsInput() {
    return null;
  }
}
