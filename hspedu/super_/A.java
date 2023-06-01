package hspedu.super_;

public class A extends Base{//这里有四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A() {
    }

    public A(String name) {
    }

    public A(String name, int age) {
    }

    public void cal() {
        System.out.println("A类的方法cal（）");
    }

    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }
}
