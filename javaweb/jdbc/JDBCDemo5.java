package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCDemo5 {
    public void demo1() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into user values(null,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "eee");
            pstmt.setString(2, "abc");
            pstmt.setString(3, "旺财");
            pstmt.setInt(4, 32);
            int num = pstmt.executeUpdate();
            if (num > 0) {
                System.out.printf("保存成功！");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(pstmt, conn);
        }
    }
}
