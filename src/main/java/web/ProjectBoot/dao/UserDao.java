package web.ProjectBoot.dao;



import web.ProjectBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User showUserById(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}
