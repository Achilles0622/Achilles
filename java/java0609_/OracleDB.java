package java0609_;

public class OracleDB implements DBInterface{
    public void connect() {
        System.out.println("connect start");

    }

 //   @Override
    public void close() {
        System.out.println("close over");
    }
}
