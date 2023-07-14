package java0705_;

public class ClassLoad03 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1加载B类并且生成B的class对象
        //2连接num=0
        //3初始化阶段
        //依次自动收集所有静态代码变量的动作和代码块中的语句
        new B();
        System.out.println(B.num);
        Class b = Class.forName("B");
    }
}
class B {
    static {
        System.out.println("B静态代码块被执行了");
        num = 300;
    }
    static int num = 100;
    public B() {//构造器
        System.out.println("B构造子被执行");
    }
}