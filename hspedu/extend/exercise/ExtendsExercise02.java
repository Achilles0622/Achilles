package hspedu.extend.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C1 c1 = new C1();
    }
}

class A1 {
    public A1() {
        System.out.println("我是A类");
    }
}

class B1 extends A1 {
    public B1() {
        System.out.println("我是b类的无参构造器");
    }

    public B1(String name) {
        System.out.println(name + "我是b类的有参构造器");
    }
}

class C1 extends B1 {
    public C1() {
        this("hello");
        System.out.println("我是c类的无参构造器");
    }

    public C1(String name) {
        super("hahah");
        System.out.println("我是c类的有参构造器");
    }
}