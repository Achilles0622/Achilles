package java0609_;

public class LocalInnerClass {
    public static void main(String[] args) {

    }
}

class Outer02 {
    private int n1 = 100;

    private void m2() {
    }

    public void m1() {
        class Inner02 {
            private void m1() {
                System.out.println("n1=" + n1);
                m2();
            }
        }
        class Inner03 extends Inner02 {

        }
    }
}
