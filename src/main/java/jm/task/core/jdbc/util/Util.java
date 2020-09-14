package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private final String HOST;
    private final String USERNAME;
    private final String PASSWORD;

    private Connection connection;

    public Util() {
        HOST        = "jdbc:mysql://localhost/dataBase?serverTimezone=UTC";
        USERNAME    = "root";
        PASSWORD    = "root";
    }

    public Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw e;
        }
    }
}
