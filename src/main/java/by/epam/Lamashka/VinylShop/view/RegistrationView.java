package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.view.userDataInput.UserDataInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * RegistrationView class.
 *
 * @author Asus
 * @version $Id: $Id
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
  protected String userDataInput(Integer option) {
    UserDataInput userDataInput = userDataInputProvider.getUserDataInput(option);
    return userDataInput.userInput();
  }
}
