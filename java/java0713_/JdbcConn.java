package java0713_;

import java.sql.DriverManager;
import java.util.Properties;

public class JdbcConn {
    public void connect01() {
        //Driver driver=new Driver();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();

        properties.setProperty("user", "root");
        properties.setProperty("password", "hsp");
        // Connection connect=driver.connect(url,properties);
        // System.out.println(connect);
    }

    //方式2 通过反射加载更加的灵活
    public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        //   Driver driver = aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();

        properties.setProperty("user", "root");
        properties.setProperty("password", "hsp");
        // Connection connect=driver.connect(url,properties);
        //System.out.println(connect);
    }

    //方式3 使用替代diver进行统一管理
    public void connect03() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        // (Driver)driver= aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "hsp";
        //DriverManager.registerDriver(Drievr);
        //  Connection connection=DriverManager.getConnection(url,user,password);
        // System.out.println(connection);
    }

    public void connect04() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "hsp";
        //  Connection connection=DriverManager.getConnection(url,user,password);
        // System.out.println(connection);
    }

}
