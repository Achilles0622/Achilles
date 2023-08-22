package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDome1 {
    public void demo1() throws Exception {
        //1加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2获得链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_test3", "root", "qwerty85910859");
        //3基本操作
        Statement statement = conn.createStatement();
        String sql = "select * from user";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.printf(rs.getString("id"));
            System.out.printf(rs.getString("username"));
            System.out.printf(rs.getString("password"));
            System.out.printf(rs.getString("nickname"));
            System.out.printf(rs.getString("age"));
            System.out.printf(" ");

        }
        //4释放资源
        rs.close();
        statement.close();
        conn.close();
    }
}
