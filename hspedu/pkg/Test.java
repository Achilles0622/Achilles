package hspedu.pkg;

import com.hspedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.n1);//在不同包下可以访问，可以public修饰方法，不可访问其他的修饰符
        a.m1();
    }
}
