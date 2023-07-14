package java0609_;

public class MysqlDb implements DBInterface {
   // @Override
    public void connect() {
        System.out.println("链接mysql");
    }

  //  @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
