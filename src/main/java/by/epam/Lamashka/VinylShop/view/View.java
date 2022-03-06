package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Controller;
import by.epam.Lamashka.VinylShop.view.userDataInput.UserDataInput;
import by.epam.Lamashka.VinylShop.view.userDataInput.UserDataInputProvider;
import javafx.util.Pair;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Abstract View class.
 *
 * @author Asus
 * @version $Id: $Id
 */
public abstract class View {
  protected Pair<String, View> response;
  protected Controller controller = new Controller();
  protected String options[];
  protected final Scanner in = new Scanner(System.in);
  protected final UserDataInputProvider userDataInputProvider = new UserDataInputProvider();

  /** Constructor for View. */
  public View() {}

  /** printOptions. */
  protected void printOptions() {
    for (String option : options) {
      System.out.println(option);
    }
  }

  /**
   * show.
   *
   * @return a {@link by.epam.Lamashka.VinylShop.view.View} object
   */
  public abstract View show();

  protected String userDataInput(Integer option) {
    UserDataInput userDataInput = userDataInputProvider.getUserDataInput(option);
    return userDataInput.userInput();
  }

  /**
   * userOptionsInput.
   *
   * @return a {@link java.lang.Integer} object
   */
  protected Integer userOptionsInput() {
    String choice = " ";
    boolean correctChoice = false;
    while (choice != "0" && !correctChoice) {
      try {
        printOptions();
        choice = in.next("[0-" + (options.length - 1) + "]");
        correctChoice = true;
      } catch (Exception ex) {
        System.out.println("Enter an integer value between 0-" + (options.length - 1));
        in.next();
      }
    }
    return parseInt(choice);
  }
  ;
}
