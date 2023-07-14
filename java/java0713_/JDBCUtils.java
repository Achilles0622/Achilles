package java0713_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtils {
    private static  String user;
    private static  String password;
    private static  String url;
    private static  String driver;
    static {
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("src\\mysql.properties"));
           user=properties.getProperty("user");
            password=properties.getProperty(" password");
            url=properties.getProperty("url");
            driver=properties.getProperty("driver");

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }//连接我们的数据库
    //public static Connection getConnection(){
       // return DriverManager.getConnection(url,user,password)
   // }
}
