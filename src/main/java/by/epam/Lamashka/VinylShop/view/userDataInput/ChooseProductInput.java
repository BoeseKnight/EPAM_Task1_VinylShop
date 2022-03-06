package by.epam.Lamashka.VinylShop.view.userDataInput;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ChooseProductInput implements UserDataInput {
  private Logger logger = LogManager.getLogger(ChooseProductInput.class);
  private final Scanner in = new Scanner(System.in);

  @Override
  public String userInput() {
    return " ";
  }
}
