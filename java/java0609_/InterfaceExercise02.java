package java0609_;

public class InterfaceExercise02 {
    public static void main(String[] args) {
    }
}
interface A2{
    int x=0;}
class B2{
    int x=1;
}
class C2 extends B2 implements A2{
    public void pX(){
//        System.out.println(x);
        System.out.println(A2.x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        new C2().pX();
    }
}
