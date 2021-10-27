package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getJDBCConnection() throws SQLException, ClassNotFoundException {
        final String URL = "jdbc:mariadb://localhost:3306/sample_db";
        final String USER = "ROOT";
        final String PASSWORD = "zee1822001";

        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
