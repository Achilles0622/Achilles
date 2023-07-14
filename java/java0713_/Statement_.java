package java0713_;

import java.util.Properties;

public class Statement_ {
    Properties properties = new Properties();
    Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
    // (Driver)driver= aClass.newInstance();
    String url = "jdbc:mysql://localhost:3306/hsp_db02";
    String user = "root";
    String password = "hsp";
    //DriverManager.registerDriver(Drievr);
    //  Connection connection=DriverManager.getConnection(url,user,password);
    //Statement statement=connection.createStatement();
    String sql="select id,name,sex,borndate from actor";

    public Statement_() throws ClassNotFoundException {
    }
    //ResultSet resultSet=statement.executeQuery(sql);
    //  while(resultSet.next()){
    //    int id= resultSet.getInt(1);
    //  String name=resultSet.getString(2);
    //  String sex=resultSet.getString(3);
    //  Date date=resultSet.getDate(4);
    //  System.out.println(id+"\t"+name+"\t"+sex+"\t"+date);

}
