package java0713_;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Batch_ {
    public void noBatch() {
        // Connection connection=JDBCUtils.getConnection;
        String sql = "insert into admin2(null,?,?)";
        //   PreparedStatement preparedStatement=connection.prepareStatement(sql);
        for (int i = 0; i < 5000; i++) {
//            prearedStaement.setString(1,"jack"+i);
//            prearedStaement.setString(2,"666");
//            prearedStaement.executeUpdate();
        }
   //      JDBCUtils.close(null,preparedStatemt);
    }
}
