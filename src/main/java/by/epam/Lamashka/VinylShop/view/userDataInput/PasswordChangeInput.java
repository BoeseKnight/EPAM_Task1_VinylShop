package by.epam.Lamashka.VinylShop.view.userDataInput;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class PasswordChangeInput implements UserDataInput {
  private Logger logger = LogManager.getLogger(PasswordChangeInput.class);
  private Scanner in = new Scanner(System.in);

  @Override
  public String userInput() {
    logger.info("ENTER YOUR CURRENT PASSWORD");
    String currentPassword = in.next();
    logger.info("ENTER A NEW PASSWORD");
    String newPassword = in.next();
    return currentPassword + " " + newPassword;
  }
}
