package by.epam.Lamashka.VinylShop.Controller.Command;

import by.epam.Lamashka.VinylShop.Service.UserService;

public class LoginCommand implements Command {
    private final UserService userService=new UserService();
    @Override
    public String execute(String parameters) {
        String[] params=parameters.split(" ");
        String email=params[0];
        String password=params[1];
//        System.out.println("Login Command was executed. Parameters: "+ params[0]+" "+params[1]);
//        System.out.println(userService.login(email, password));
        if (userService.login(email, password) == null) {
            return "You have entered either your email address or password incorrectly.";
        }
        else {
            return "LogIn passed successfully";
        }
    }
}
