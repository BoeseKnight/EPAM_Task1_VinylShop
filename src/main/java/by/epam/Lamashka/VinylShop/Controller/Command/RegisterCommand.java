package by.epam.Lamashka.VinylShop.Controller.Command;

import by.epam.Lamashka.VinylShop.Service.UserService;

public class RegisterCommand implements Command {
    private final UserService userService = new UserService();

    @Override
    public String execute(String parameters) {
        String[] params = parameters.split(" ");
        String email = params[0];
        String password = params[1];
        System.out.println("Register Command was executed. Parameters: " + params[0] + " " + params[1]);
//        System.out.println(userService.register(email, password));
        if (userService.register(email, password) == null) {
            return "You are already registered";
        }
        else {
            return "Registration passed successfully";
        }
    }
}
