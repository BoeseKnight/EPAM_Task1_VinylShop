package by.epam.Lamashka.VinylShop.Controller.Command;

import by.epam.Lamashka.VinylShop.Service.UserService;

public class PasswordChangeCommand implements Command {
  private final UserService userService = new UserService();

  @Override
  public String execute(String parameters) {
    String[] params = parameters.split(" ");
    String email = params[0];
    String password = params[1];
    System.out.println("CHANGE Command was executed. Parameters: " + params[0] + " " + params[1]);
    //        System.out.println(userService.login(email, password));
    if (userService.changePassword(email, password) == null) {
      return "SMTH WRONG";
    } else {
      return "CHANGED";
    }
  }
}
