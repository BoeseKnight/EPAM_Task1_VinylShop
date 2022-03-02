package by.epam.Lamashka.VinylShop.controller.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
  private final Map<CommandName, Command> commands = new HashMap<>();
  private Command command;

  public CommandProvider() {
    commands.put(CommandName.LOGIN, new LoginCommand());
    commands.put(CommandName.REGISTER, new RegisterCommand());
    commands.put(CommandName.PASSWORD_CHANGE, new PasswordChangeCommand());
    commands.put(CommandName.EMAIL_CHANGE, new EmailChangeCommand());
    commands.put(CommandName.ADD_PRODUCT_TO_BASKET, new AddProductToBasketCommand());
    commands.put(CommandName.ADD_PRODUCT_TO_SHOP, new AddProductToShopCommand());
    commands.put(CommandName.DELETE_PRODUCT_FROM_BASKET, new DeleteProductFromBasket());
    commands.put(CommandName.DELETE_PRODUCT_FROM_SHOP, new DeleteProductFromShopCommand());
    commands.put(CommandName.SHOW_ALL_PRODUCTS, new ShowAllProducts());
    commands.put(CommandName.SHOW_ALL_USERS, new ShowAllUsersCommand());
    commands.put(CommandName.CHECKOUT, new CheckoutCommand());
  }

  public Command getCommand(CommandName commandName) {
    return commands.get(commandName);
  }
}
