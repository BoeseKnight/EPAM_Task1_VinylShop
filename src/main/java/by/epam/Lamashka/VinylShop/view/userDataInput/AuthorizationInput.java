package by.epam.Lamashka.VinylShop.view.userDataInput;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AuthorizationInput implements UserDataInput {
    private Logger logger = LogManager.getLogger(AuthorizationInput.class);
    private Scanner in = new Scanner(System.in);
    @Override
    public String userInput() {
        logger.info("ENTER AN EMAIL");
        String email = in.next();
        while (!Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email)) {
            logger.info("Incorrect Email format. Try again.");
            email = in.next();
        }
        logger.info("ENTER A PASSWORD");
        String password = in.next();
        return email + " " + password;
    }
}
