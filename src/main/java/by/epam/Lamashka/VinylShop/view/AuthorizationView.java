package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.controller.Command.LoginCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AuthorizationView extends View {
  private static Logger logger = LogManager.getLogger(AuthorizationView.class);

  public AuthorizationView() {
    options = new String[] {"1-ENTER LOGIN", "2-ENTER PASSWORD"};
  }

  @Override
  public View show() {
    String commandParameters = userDataInput();
    response = controller.executeCommand(CommandName.LOGIN, commandParameters);
    logger.info(response.getKey());
    return response.getValue();
  }

  @Override
  protected String userDataInput() {
    return EmailPasswordInput.userInput();
  }
}
