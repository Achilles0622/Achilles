package java0609_;

public class Override {
    public static void main(String[] args) {

    }
}
class Father1{
    public void fly(){
        System.out.println("father fly^^^^");
    }
}
class Son extends Father1{
    public void fly(){
        System.out.println("son fly^^^^^^^^");
    }
    public  void say(){}
}
