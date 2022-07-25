package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public void createTable();
    public void dropTable();
    public void add(User user);
    public void delete(User user);
    public void update(User user);
    public List<User> select();
    public User getUserById(long id);
}
