package by.epam.Lamashka.VinylShop.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * <p>EmailPasswordInput class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class EmailPasswordInput {
  private static Logger logger = LogManager.getLogger(EmailPasswordInput.class);
  private static Scanner in = new Scanner(System.in);

  /**
   * <p>userInput.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public static String userInput() {
    logger.info("ENTER AN EMAIL");
    String email = in.next();
    while (!Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email)) {
      logger.info("Incorrect Email format. Try again.");
      email = in.next();
    }
    logger.info("ENTER A PASSWORD");
    String password = in.next();
    return email + " " + password;
  }
}
