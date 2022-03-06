package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.controller.Command.LoginCommand;
import by.epam.Lamashka.VinylShop.view.userDataInput.UserDataInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * <p>AuthorizationView class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class AuthorizationView extends View {
  private static Logger logger = LogManager.getLogger(AuthorizationView.class);

  /**
   * <p>Constructor for AuthorizationView.</p>
   */
  public AuthorizationView() {
    options = new String[] {"1-ENTER LOGIN", "2-ENTER PASSWORD"};
  }

  /** {@inheritDoc} */
  @Override
  protected Integer userOptionsInput() {
    return null;
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

  /** {@inheritDoc} */
  @Override
  protected String userDataInput(Integer option) {
    UserDataInput userDataInput=userDataInputProvider.getUserDataInput(option);
    return userDataInput.userInput();
  }
}
