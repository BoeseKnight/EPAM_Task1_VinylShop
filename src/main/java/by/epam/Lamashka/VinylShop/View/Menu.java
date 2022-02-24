package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.Controller.Controller;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class Menu extends View {
  private static String response;
  private static Scanner in = new Scanner(System.in);
  private static String options[] = {"1-LOGIN", "2-REGISTER", "3-CHANGE PASSWORD", "0-EXIT"};
  private static Controller controller = new Controller();

  public View show() {
    ViewProvider viewProvider = new ViewProvider();
    Integer option = userOptionsInput();

    View view = viewProvider.getView(option);
    while (view != null) {
      view=view.show();
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

  private static void printMenu() {
    for (String option : options) {
      System.out.println(option);
    }
  }

  private static Integer userOptionsInput() {
    int choice = -1;
    boolean correctChoice = false;
    while (choice != 0 && !correctChoice) {
      try {
        printMenu();
        choice = in.nextInt();
        correctChoice = true;
      } catch (Exception ex) {
        System.out.println("Enter an integer value between 0-" + (options.length - 1));
        in.next();
      }
    }
    return choice;
  }
}
