package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * <p>RegistrationView class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class RegistrationView extends View {
  /**
   * <p>Constructor for RegistrationView.</p>
   */
  public RegistrationView() {
    options = new String[] {"1-ENTER LOGIN", "2-ENTER PASSWORD"};
  }

  private static Logger logger = LogManager.getLogger(AuthorizationView.class);

  /** {@inheritDoc} */
  @Override
  public View show() {
    logger.info("REGISTRATION MENU");
    String commandParameters = userDataInput();
    response = controller.executeCommand(CommandName.REGISTER, commandParameters);
    logger.info(response.getKey());
    return response.getValue();
  }

  /** {@inheritDoc} */
  @Override
  protected void printOptions() {
    super.printOptions();
  }

  /** {@inheritDoc} */
  @Override
  protected Integer userOptionsInput() {
    return null;
  }

  /** {@inheritDoc} */
  @Override
  protected String userDataInput() {
    return EmailPasswordInput.userInput();
  }
}
