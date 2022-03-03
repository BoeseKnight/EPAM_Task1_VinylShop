package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.Session;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.view.AdminView;
import by.epam.Lamashka.VinylShop.view.AuthorizationView;
import by.epam.Lamashka.VinylShop.view.CustomerView;
import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

public class ShowAllUsersCommand implements Command {
  private final UserService userService = ServiceFactory.getInstance().getUserService();
  private static Logger logger = LogManager.getLogger(ShowAllUsersCommand.class);

  @Override
  public Pair<String, View> execute(String parameters) {
//    Session session=Session.getInstance();
//    System.out.println(session.getUser());
    for (User user : userService.usersSort()) {
      logger.info(user);
    }
    return new Pair("ALL USERS ARE PRINTED.", new CustomerView()); //must be AdminView
  }
}
