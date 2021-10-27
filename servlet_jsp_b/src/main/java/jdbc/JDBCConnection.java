package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getJDBCConnection() throws SQLException, ClassNotFoundException {
        final String URL = "jdbc:mariadb://localhost:3306/sample_db";
        final String USER = "root";
        final String PASSWORD = "zee1822001";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
