package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Controller;
import javafx.util.Pair;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public abstract class View {
  protected Pair<String, View> response;
  protected Controller controller = new Controller();
  protected String options[];
  protected final static Scanner in = new Scanner(System.in);
  public View() {}

  protected void printOptions() {
    for (String option : options) {
      System.out.println(option);
    }
  }

  public abstract View show();

  protected abstract String userDataInput();

  protected Integer userOptionsInput(){
    String choice = "";
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
  };
}
