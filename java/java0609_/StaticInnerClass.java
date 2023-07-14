package java0609_;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer022 outer022 = new Outer022();
        outer022.m1();
    }
}

class Outer022 {
    private int n1 = 10;
    private static String name = "张三";

    static class Inner10 {
        public void  say(){
            System.out.println(name);
        }
    }
//        public void say() {
//            System.out.println(name);
//        }
//    }
//
//    private void show() {
//        new Inner10().say();
    public void m1(){
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
}

