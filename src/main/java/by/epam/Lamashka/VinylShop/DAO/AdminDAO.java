package by.epam.Lamashka.VinylShop.DAO;

import by.epam.Lamashka.VinylShop.Entitiy.Admin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AdminDAO implements DAO<Admin>{
    private List<Admin> admins = new ArrayList<>();

    @Override
    public void update(Admin admin) {

    }

    @Override
    public void delete(Admin admin) {
admins.remove(admin);
    }

    @Override
    public void save(Admin admin) {
        admins.add(admin);
    }

    @Override
    public Collection<Admin> getAll() {
        return null;
    }

    @Override
    public Admin get(int id) {
        return null;
    }
}
