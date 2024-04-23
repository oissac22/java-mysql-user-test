package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    static private String database = "testjava";
    static private short port = 3431;
    static private String url = "jdbc:mysql://localhost:" + port + "/" + database;
    static private String user = "root";
    static private String password = "test@123456";
    
    static public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

}
