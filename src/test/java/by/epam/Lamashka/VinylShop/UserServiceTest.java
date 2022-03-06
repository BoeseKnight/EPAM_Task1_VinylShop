package by.epam.Lamashka.VinylShop;

import by.epam.Lamashka.VinylShop.dao.UserDAO;
import by.epam.Lamashka.VinylShop.entity.User;
import by.epam.Lamashka.VinylShop.service.ServiceFactory;
import by.epam.Lamashka.VinylShop.service.UserService;
import by.epam.Lamashka.VinylShop.service.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {
  @Test
  public void loginTest() {
    UserDAO users = mock(UserDAO.class);
    UserService userServiceMock = new UserServiceImpl(users);
    User user = new User("admin@a", "admin");
    when(users.findByEmailAndPassword("admin@a", "admin")).thenReturn(user);
    assertEquals(user, userServiceMock.login(user.getEmailAddress(), user.getPassword()));
  }

  @Test
  public void registrationTest() {
    UserDAO users = mock(UserDAO.class);
    UserService userServiceMock = new UserServiceImpl(users);
    User user = new User("admin@a", "admin");
    when(users.findByEmail("admin@a")).thenReturn(null);
    assertEquals(user, userServiceMock.register(user.getEmailAddress(), user.getPassword()));
  }

  @Test
  public void changePasswordTest() {
    UserDAO users = mock(UserDAO.class);
    UserService userServiceMock = new UserServiceImpl(users);
    User newUser = new User("admin@a", "admin222");
    User oldUser = new User("admin@a", "admin");
    when(users.findByEmail("admin@a")).thenReturn(oldUser);
    assertEquals(
        newUser, userServiceMock.changePassword(newUser.getEmailAddress(), newUser.getPassword()));
  }

  @Test
  public void changeEmailTest() {
    UserDAO users = mock(UserDAO.class);
    UserService userServiceMock = new UserServiceImpl(users);
    User oldUser = new User("admin1@a", "admin");
    User newUser = new User("admin2@a", "admin");

    when(users.findByEmail("admin1@a")).thenReturn(oldUser);
    when(users.findByEmail("admin2@a")).thenReturn(null);

    assertEquals(
        newUser,
        userServiceMock.changeEmail(
            oldUser.getEmailAddress(), newUser.getEmailAddress(), oldUser.getPassword()));
  }
}
