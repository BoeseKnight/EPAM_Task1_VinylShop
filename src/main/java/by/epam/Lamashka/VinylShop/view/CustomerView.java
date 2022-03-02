package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CustomerView extends View {
  private static Logger logger = LogManager.getLogger(CustomerView.class);
  private static Scanner in = new Scanner(System.in);

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

  @Override
  public View show() {
    CommandName command;
    String commandParameters="";
    logger.info("Customer menu");
    Integer option = userOptionsInput();
    if (option != 0) {
      if (option == 1 || option == 2) {
        commandParameters = userDataInput();
      }
      response = controller.executeCommand(CommandName.values()[option + 1], commandParameters);
      logger.info(response.getKey());
      return response.getValue();
    } else return null;
  }

  @Override
  protected String userDataInput() {
    return EmailPasswordInput.userInput();
  }

  @Override
  protected Integer userOptionsInput() {
    String choice = "";
    boolean correctChoice = false;
    while (choice != "0" && !correctChoice) {
      try {
        printOptions();
        choice = in.next("[0-3]");
        correctChoice = true;
      } catch (Exception ex) {
        System.out.println("Enter an integer value between 0-" + (options.length - 1));
        in.next();
      }
    }
    return parseInt(choice);
  }
}
