package java0609_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    public int n1 =99;
    public  void f1(){
        Person p =new Person() {
            public void hi() {

                    System.out.println("重写了hi方法");
                }
            };
p.hi();

    }
}
class Person{
    public void  hi(){
        System.out.println("Person hi ()");
    }
}
