package java0608_;



public class CodeBlockDetail01 {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(CC.n1);

    }
}

class CC{

   public static int n1=999;
    static {
        System.out.println("CC的静态代码卡被执行");
    }
}
class BB{
    static {
        System.out.println("BB的静态代码卡被执行");
    }
}
class AA extends BB{
    static {
        System.out.println("AA的静态代码块被执行");
    }
}
