package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.Controller.Controller;

public class CustomerView extends View {
  public CustomerView() {

    options = new String[] {"1-ADD PRODUCT TO BASKET", "2-BUY", "3-CHANGE PASSWORD"};
  }

  @Override
  public View show() {
    printOptions();
    this.controller.executeCommand(CommandName.LOGIN, "f");
    return null;
  }

  @Override
  protected String userDataInput() {
    return null;
  }
}
