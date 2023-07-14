package java0607_;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name );
        A a = new A();
        // 通过对象名.变量名也可以访问
        System.out.println("a.name="+a.name);
    }
}
class A{
    public static String name="韩顺平教育";
private int num=10;

}
