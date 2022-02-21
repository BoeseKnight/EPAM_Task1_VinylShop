package by.epam.Lamashka.VinylShop.Entitiy;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private static final AtomicInteger count = new AtomicInteger(-1);
    private final int id;
    private String password;
    private String emailAddress;
    private UserRole role;

    public User(String emailAddress, String password) {
        this.password = password;
        this.emailAddress = emailAddress;
        id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password.equals(user.password) && emailAddress.equals(user.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, emailAddress);
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
