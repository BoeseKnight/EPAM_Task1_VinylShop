package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Controller;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Menu extends View {
  private static Scanner in = new Scanner(System.in);
  private static String response;
  private static Controller controller = new Controller();

  public Menu() {
    options = new String[] {"1-LOGIN", "2-REGISTER", "0-EXIT"};
  }

  public View show() {
    ViewProvider viewProvider = new ViewProvider();
    Integer option = userOptionsInput();
    View view = viewProvider.getView(option);
    while (view != null) {
      view = view.show();
    }

    return null;
  }
  //  private static void authorization() {
  //    String commandParameters;
  //    int choice = -1;
  //    while (choice != 0
  //        && response
  //            != "LogIn passed successfully" /*&& response!="Registration passed successfully"*/)
  // {
  //      try {
  //        printMenu();
  //        choice = in.nextInt();
  //        switch (choice) {
  //          case 1:
  //            commandParameters = userDataInput();
  //            System.out.println(
  //                response = controller.executeCommand(CommandName.LOGIN, commandParameters));
  //
  //            break;
  //          case 2:
  //            commandParameters = userDataInput();
  //            System.out.println(
  //                response = controller.executeCommand(CommandName.REGISTER, commandParameters));
  //            break;
  //          case 3:
  //            commandParameters = userDataInput();
  //            System.out.println(
  //                response =
  //                    controller.executeCommand(CommandName.PASSWORD_CHANGE, commandParameters));
  //
  //            break;
  //          case 0:
  //            exit(0);
  //        }
  //      } catch (Exception ex) {
  //        System.out.println("Enter an integer value between 0-" + (options.length - 1));
  //        in.next();
  //      }
  //    }
  //  }
  @Override
  protected String userDataInput() {

    System.out.println("Enter an Email.");
    String email = in.next();
    while (!Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email)) {
      System.out.println("Incorrect Email format. Try again.");
      email = in.next();
    }
    System.out.println("Enter a Password.");
    String password = in.next();
    return email + " " + password;
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
