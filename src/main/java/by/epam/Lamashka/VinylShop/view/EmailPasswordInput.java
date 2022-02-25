package by.epam.Lamashka.VinylShop.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailPasswordInput {
    private static Logger logger= LogManager.getLogger(EmailPasswordInput.class);
    private static Scanner in = new Scanner(System.in);
    public static String userInput(){
        logger.info("Enter an Email.");
        String email = in.next();
        while (!Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email)) {
            logger.info("Incorrect Email format. Try again.");
            email = in.next();
        }
        logger.info("Enter a Password.");
        String password = in.next();
        return email + " " + password;
    }
}
