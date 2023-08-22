package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static final String driverClassName;
    private static final String url;
    private static final String username;
    private static final String password;
    static {
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("jdbc/db.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        properties.getProperty("driverClassName");
        properties.getProperty("url");
        properties.getProperty("username");
        properties.getProperty("password");

        driverClassName="com.mysql.jdbc.Driver";
        url="com.mysql.jdbc.Driver";
        username="root";
        password="qwerty85910859";
    }


    public static void loadDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;

        try {
            loadDriver();
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void release(Statement stmt, Connection conn) {

    }

    public static void release(ResultSet rs, Statement stmt, Connection conn) {

    }

}

