package java0705_;

public class ClassLoad02 {
    public static void main(String[] args) {

    }
}
class A{
    //1 n1是实例属性，不是静态变量，因此在准备阶段不会分配内存
    //2 n2是静态变量，分配内存n2是默认初始化0，而不是20
    //3 n3是static final是常量，他和静态变脸不一样 因为一旦赋值了就不变了n3=30

    public int n1=10;
    public static int n2=20;
    public  static  final int n3=30;

}
