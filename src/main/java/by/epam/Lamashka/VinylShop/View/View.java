package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Controller;

public abstract class View {
  protected String response;
  protected Controller controller;
  protected String options[];

  public abstract void show();

  protected void printOptions() {
    for (String option : options) {
      System.out.println(option);
    }
  }

  public View(Controller controller) {
    this.controller = controller;
  }
}
