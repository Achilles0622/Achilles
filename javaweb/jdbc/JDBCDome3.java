package jdbc;

//import com.mysql.jdbc.log.Jdk14Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDome3 {
    public void demo1() throws SQLException {
        Connection conn = null;
        Statement stsm = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            stsm = conn.createStatement();
            String sql = "select * from user";
            rs = stsm.executeQuery(sql);
            while (rs.next()) {
                System.out.printf(rs.getString("id") + rs.getString("username") + rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stsm, conn);
        }
    }
}
