package java0705_;

import java0702_.Cat;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Cat cat=new Cat();
        Class aClass = Class.forName("java0702_.Cat");
    }
}
