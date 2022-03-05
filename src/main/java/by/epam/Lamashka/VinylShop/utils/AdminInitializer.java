package by.epam.Lamashka.VinylShop.utils;

import by.epam.Lamashka.VinylShop.dao.DAOFactory;
import by.epam.Lamashka.VinylShop.dao.UserDAO;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.entity.UserRole;

import java.io.FileNotFoundException;

public class AdminInitializer implements Initializer{
    @Override
    public void initialize() throws FileNotFoundException {
        UserDAO users = DAOFactory.getInstance().getUserDAO();
        users.save(new User("admin@a", "admin", UserRole.Admin));
    }
}
