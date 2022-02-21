package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Command.CommandName;
import by.epam.Lamashka.VinylShop.Controller.Controller;

public class CustomerView extends View {
  public CustomerView(Controller controller) {
    super(controller);
    options = new String[] {"1-ADD PRODUCT TO BASKET", "2-BUY", "3-CHANGE PASSWORD"};
  }

  @Override
  public void show() {
    printOptions();
    this.controller.executeCommand(CommandName.LOGIN, "f");
  }
}
