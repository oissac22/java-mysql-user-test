package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    static private String url = "jdbc:mysql://localhost:3431/testjava";
    static private String user = "root";
    static private String password = "test@123456";
    
    static public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

}
