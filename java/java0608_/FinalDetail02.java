package java0608_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB1.num);
    }
}
class BBB1{
    public final static int num=10000;
    static {
        System.out.println("BBB10000");
    }
}
final class AAA1{
    public final void cry(){}
}
