package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private Connection connection;

    public Util() {
    }

    public Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/dataBase?serverTimezone=UTC",
                    "root", "root");
        } catch (SQLException e) {
            throw e;
        }
    }
}
