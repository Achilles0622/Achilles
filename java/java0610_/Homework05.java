package java0610_;

public class Homework05 {
    public static void main(String[] args) {
         new A().f1();

    }
}
class A{
    private String name ="hi";
    public void  f1(){
        class B{
            private final String NAME="hsp";
            public void show(){
                System.out.println("NAME="+NAME+"外部类的name="+name);
            }
        }
        B b = new B();
        b.show();
    }
}
