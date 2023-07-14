package java0608_;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();
        //非静态方法不能通过类名调用
    }
}
class D{
    private int n1=100;
    private static int n2=200;
    public void say(){

    }
    public static void hi(){
        System.out.println();
    }
    public static void hello(){
        System.out.println(n2);
        System.out.println(D.n2);
        hi();

    }
    public void ok(){
        System.out.println(n1+" "+n2);
        say();
    }
}

