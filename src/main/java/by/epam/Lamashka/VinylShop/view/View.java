package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Controller;
import javafx.util.Pair;

public abstract class View {
  protected Pair<String, View> response;
  protected Controller controller = new Controller();
  protected String options[];

  public View() {}

  protected void printOptions() {
    for (String option : options) {
      System.out.println(option);
    }
  }

  public abstract View show();

  protected abstract String userDataInput();
  protected abstract Integer userOptionsInput();
}
