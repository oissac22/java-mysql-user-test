import java.util.ArrayList;

import dao.UserDao;
import entityes.User;

public class Main {
    public static void main(String[] args) throws Exception {
        Test.testListUser();
    }
}


class Test {

    static public void testInsertUser() {
        User user = new User();
        user.setName("Cássio SC");
        user.setEmail("cassio@test.com");
        user.setPassword("pass123456");

        UserDao.newUser(user);
        System.out.println("NEW USER ADD");
    }

    static public void testListUser() {
        System.out.println("\nLISTA DE USUÁRIOS:");
        ArrayList<User> userList = UserDao.listUser();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println("");
            User user = userList.get(i);
            System.out.println(user);
        }
        System.out.println("");
    }

}