package jdbc;

import org.junit.jupiter.api.Test;

public class JDBCDemo4 {
    @Test
    public void demo1(){
        UserDao userDao=new UserDao();
      boolean flag=  userDao.login("aaa","123");
      if (flag) {
          System.out.printf("登録成功");
      }else{
          System.out.printf("登録失敗");
      }
    }

}
