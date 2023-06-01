package hspedu.modifier;

public class B {
    //在同一个包里可以访问什么
    public void say() {
        A a = new A();
        System.out.println("n1=" + a.n1 + " " + a.n2 + " " + a.n3 + " ");//不能访问private
        a.m1();
        a.m2();
        a.m3();
    }
}
