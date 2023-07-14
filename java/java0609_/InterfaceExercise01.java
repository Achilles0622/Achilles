package java0609_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B1 b1 = new B1();
        System.out.println(b1.a1);
        System.out.println(B1.a1);
        System.out.println(A1.a1);

    }
}
interface A1{
    int a1 =23;
}
class B1 implements A1{

}


