package java0705_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> userClass = Class.forName("java0705_.User");
        Object o = userClass.newInstance();
        System.out.println(o);
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object hsp = constructor.newInstance("hsp");
        System.out.println(hsp);

    }
}
class User {//
    private int age=10;
    private String name="sssss";
    public User() {
    }
    public User(String name) {
        this.name = name;
    }
    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "User[age=" + age + ",name" + name + "]";
    }
}