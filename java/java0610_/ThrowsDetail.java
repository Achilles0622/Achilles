package java0610_;

import java.io.FileInputStream;

public class ThrowsDetail {
    public static void main(String[] args) throws ArithmeticException {
        f2();

    }

    public static void f2() throws ArithmeticException {
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }
    public static void f1(){

        f3();
    }
    public static void f3()throws RuntimeException{
    }
}

class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father {
    public void method() throws java.lang.NumberFormatException {
    }
}