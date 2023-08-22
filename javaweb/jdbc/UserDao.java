package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {
    public boolean login(String username, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select* from user where username='" + username + "'and password='" + password + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                flag = true;

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }
        return false;

    }
}
