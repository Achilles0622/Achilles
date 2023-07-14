package java0609_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A3 tiger1 = new Tiger1();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
//        new A() {
//            @Override
//            public void cry() {
//
//            }
//        };
//        new Father("zs") {
//
//        };
    }
}

interface A3{
    public void cry();
}
class Tiger1 implements A3{
   // @Override
    public void cry() {
        System.out.println("老虎");
    }
}

class Father {
    public Father(String name) {
        super();
    }

    public void test() {

    }
}