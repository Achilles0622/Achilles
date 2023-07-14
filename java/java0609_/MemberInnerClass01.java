package java0609_;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        Outer08.Inner08 inner08 = outer08.new Inner08();
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "长三";
    public void hi(){
        System.out.println("hi");
    }

    public class Inner08 {
        private double sal=1000;
        public void say() {
            System.out.println("Outer01的n1=" + n1 + "outer01的name=" + name);
            hi();
        }
    }

    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}
