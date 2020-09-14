package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Alex", "Habba", (byte) 37);
        userService.saveUser("Alex", "Habba", (byte) 37);
        userService.saveUser("Alex", "Habba", (byte) 37);
        userService.saveUser("Alex", "Habba", (byte) 37);

        List<User> allUsers = userService.getAllUsers();
        allUsers.forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
