package by.epam.Lamashka.VinylShop.view;

import by.epam.Lamashka.VinylShop.controller.Command.CommandName;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegistrationView extends View {
  public RegistrationView() {
    options = new String[] {"1-ENTER LOGIN", "2-ENTER PASSWORD"};
  }

  @Override
  public View show() {
    String commandParameters = userDataInput();
    response=controller.executeCommand(CommandName.REGISTER, commandParameters);
    System.out.println(response.getKey());
    return response.getValue();
  }

  @Override
  protected String userDataInput() {
    Scanner in = new Scanner(System.in);
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
}
