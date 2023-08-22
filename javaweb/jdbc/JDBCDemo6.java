package jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.Statement;

public class JDBCDemo6 {
    public void demo1() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql1 = "create datebase test1";
            String sql2 = "use test1";
            String sql3 = "create table user(id int primary key auto_incremetn,name varchar(20)";
            String sql4 = "insert into user values(null,'aaa')";
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            stmt.addBatch(sql3);
            stmt.addBatch(sql4);
            stmt.executeBatch();

        } catch (
                Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(stmt, conn);
        }

    }
}
