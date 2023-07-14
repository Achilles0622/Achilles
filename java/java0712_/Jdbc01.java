package java0712_;

import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) {
        //在项目下 创建一个比如libs 拷贝该目录下
        //1.注册驱动
       // Driver driver = new Driver(); 创建driver对象 驱动
        //2.得到连接
        String url ="jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties=new Properties();

        properties.setProperty("user","root");
        properties.setProperty("password","hsp");
       // Connection connect=driver.connect(url,properties);
        //3.执行sql
        String sql ="insert into actor values (null,'ldh','男''1980-11-11','110')";
       // Statement statement=connect.createStatement();
      //  int rows=statement.executeUpdate(sql);
     //   System.out.println(rows>0?"成功":"失败");

        //4.关闭连接
        //statement.close();
        //connect.close();
    }
}
