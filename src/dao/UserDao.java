package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.ConnectionDB;
import entityes.User;

public class UserDao {

    static public void newUser(User user) {
        String sql = "insert into user (name, email, password) values (?, ?, ?)";

        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static public ArrayList<User> listUser(int index) {
        String sql = "select * from user limit " + index + ",10";
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ArrayList<User> userList = new ArrayList<User>();

            while ( rs.next() ) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));

                userList.add(user);
            }

            ps.close();
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    static public ArrayList<User> listUser() {
        return listUser(0);
    }
    
}
