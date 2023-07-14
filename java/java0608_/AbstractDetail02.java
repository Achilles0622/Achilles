package java0608_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
abstract class E{
    public  abstract void hi();
}
class F extends E{
    @Override
    public void hi() {

    }
}
abstract class D1{
    public int n1=10;
    public static String name ="hsp";
    public void id(){
        System.out.println("id");
    }
    public abstract void hello();
    public static void ok(){
        System.out.println("ok");
    }


}