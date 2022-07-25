package web.service;

import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();
    @Override
    public void createTable() {
        userDAO.createTable();
    }

    @Override
    public void dropTable() {
        userDAO.dropTable();
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public List<User> select() {
        return userDAO.select();
    }

    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }
}
