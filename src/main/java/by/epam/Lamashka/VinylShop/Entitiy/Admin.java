package by.epam.Lamashka.VinylShop.Entitiy;

import java.util.concurrent.atomic.AtomicInteger;

public class Admin {
    public int getId() {
        return id;
    }

    private final static AtomicInteger count=new AtomicInteger(-1);
    private final int id;
    private String adminPassword="adminadmin";
    private String adminEmail="admin@a.a";

    public Admin() {
        this.id = count.incrementAndGet();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }
}
