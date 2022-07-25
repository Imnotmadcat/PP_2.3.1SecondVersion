package web.dao;

import web.model.User;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserDAOImpl implements UserDAO {
    private EntityManager entityManager;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private static Map<Long,User> userMap = new HashMap<>();

    static {
        User user1 = new User();
        user1.setId(atomicInteger.getAndIncrement());
        user1.setAge(20);
        user1.setName("Oleg");
        user1.setCar("Tesla");
        userMap.put(user1.getId(),user1);
        User user2 = new User();
        user2.setId(atomicInteger.getAndIncrement());
        user2.setAge(30);
        user2.setName("Egor");
        user2.setCar("BMW");
        userMap.put(user1.getId(),user2);
    }

    @Override
    public void dropTable() {

    }

    @Override
    public void createTable() {

    }

    @Override
    public void add(User user) {
        user.setId(atomicInteger.getAndIncrement());
        userMap.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        userMap.remove(user.getId());
    }

    @Override
    public void update(User user) {
        userMap.put(user.getId(),user);
    }

    @Override
    public List<User> select() {

        return new ArrayList<>(userMap.values());
    }

    @Override
    public User getUserById(long id) {
        return userMap.get(id);
    }


}
