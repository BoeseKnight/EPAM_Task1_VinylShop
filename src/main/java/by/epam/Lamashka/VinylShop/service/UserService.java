package by.epam.Lamashka.VinylShop.service;

import by.epam.Lamashka.VinylShop.entity.User;

import java.util.Collection;

public interface UserService {

  User login(String email, String password);

  User register(String email, String password);

  User changePassword(String email, String password);

  User changeEmail(String oldEmail, String password, String newEmail);

  Collection<User> usersSort();
}
