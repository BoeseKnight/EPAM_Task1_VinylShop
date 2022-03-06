package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * AuthorizationView class.
 *
 * @author Ilya Lamashka (BoeseKnight)
 * @version 1.0
 * @since 05-03-2022
 */
public class AuthorizationView extends View {
  private static Logger logger = LogManager.getLogger(AuthorizationView.class);

  /** Constructor for AuthorizationView. */
  public AuthorizationView() {
    options = new String[] {"1-ENTER LOGIN", "2-ENTER PASSWORD"};
  }

  /** {@inheritDoc} */
  @Override
  public View show() {
    logger.info("LOGIN MENU");
    String commandParameters = userDataInput(1);
    response = controller.executeCommand(CommandName.LOGIN, commandParameters);
    logger.info(response.getKey());
    return response.getValue();
  }
}
