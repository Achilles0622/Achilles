package hspedu.extend;

public class Base extends TopBase{
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("Base().....");
    }
    public Base(String name) {//
        System.out.println("父类的base(name)构造器被调用");
    }
    public Base(String name, int age) {//默认super
        System.out.println("父类的base(name,age)构造器被调用");
    }

    public int getN4() {
        return n4;
    }

    public void test1000() {
        System.out.println("test100");
    }

    protected void test2000() {
        System.out.println("test200");

    }

    void test3000() {
        System.out.println("test300");
    }

    private void test4000() {
        System.out.println("test400");
    }
}
