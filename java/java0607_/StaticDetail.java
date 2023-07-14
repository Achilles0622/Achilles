package java0607_;

public class StaticDetail
{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(B.n1);
        System.out.println(C.address);
    }
}
class B{
    public static int n1=100;

}
class C{
    public static String address="北京";
}