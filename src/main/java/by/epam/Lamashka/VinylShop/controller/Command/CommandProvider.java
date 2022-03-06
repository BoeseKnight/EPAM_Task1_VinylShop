package by.epam.Lamashka.VinylShop.controller.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>CommandProvider class.</p>
 *
 * @author Asus
 * @version $Id: $Id
 */
public class CommandProvider {
  private final Map<CommandName, Command> commands = new HashMap<>();
  private Command command;

  /**
   * <p>Constructor for CommandProvider.</p>
   */
  public CommandProvider() {
    commands.put(CommandName.LOGIN, new LoginCommand());
    commands.put(CommandName.REGISTER, new RegisterCommand());
    commands.put(CommandName.PASSWORD_CHANGE, new PasswordChangeCommand());
    commands.put(CommandName.EMAIL_CHANGE, new EmailChangeCommand());
    commands.put(CommandName.ADD_PRODUCT_TO_BASKET, new AddProductToBasketCommand());
    commands.put(CommandName.ADD_PRODUCT_TO_SHOP, new AddProductToShopCommand());
    commands.put(CommandName.DELETE_PRODUCT_FROM_BASKET, new DeleteProductFromBasket());
    commands.put(CommandName.DELETE_PRODUCT_FROM_SHOP, new DeleteProductFromShopCommand());
    commands.put(CommandName.SHOW_ALL_PRODUCTS, new ShowAllProductsCommand());
    commands.put(CommandName.SHOW_ALL_USERS, new ShowAllUsersCommand());
    commands.put(CommandName.CHECKOUT, new CheckoutCommand());
  }

  /**
   * <p>Getter for the field <code>command</code>.</p>
   *
   * @param commandName a {@link by.epam.Lamashka.VinylShop.controller.Command.CommandName} object
   * @return a {@link by.epam.Lamashka.VinylShop.controller.Command.Command} object
   */
  public Command getCommand(CommandName commandName) {
    return commands.get(commandName);
  }
}
