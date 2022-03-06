package by.epam.Lamashka.VinylShop.view.userDataInput;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ProductChoiceInput implements UserDataInput{
    private static Logger logger = LogManager.getLogger(ProductChoiceInput.class);
    private Scanner in = new Scanner(System.in);
    @Override
    public String userInput() {
        logger.info("ENTER AN INDEX OF PRODUCT");
        return in.next();
    }
}
