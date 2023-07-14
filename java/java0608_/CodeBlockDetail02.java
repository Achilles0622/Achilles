package java0608_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A1 a = new A1();

    }
}

class A1 {
    private int n2 =getN2();
    {
        System.out.println("A的普通代码块");
    }
    private static int n1 =getN1();

    static {
        System.out.println("a1静态代码块");
    }
    public static int getN1(){
        System.out.println("getN1^^^");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2~~~~~");
        return 200;
    }
}
