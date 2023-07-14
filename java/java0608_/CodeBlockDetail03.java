package java0608_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{
    public AAA(){
        System.out.println("AAA()^^^^^^^^");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBBBB代码块");
    }
    public BBB() {
        System.out.println("BBBBBB()~~~~~~~");
    }
}
