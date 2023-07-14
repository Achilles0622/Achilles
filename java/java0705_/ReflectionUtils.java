package java0705_;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    public void api_01() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personCls = Class.forName("java0705_.Person");
        System.out.println(personCls.getName());
        System.out.println(personCls.getSigners());
        Field[] fields = personCls.getFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }
    }
}

class Person {
    public String name;
    protected int age;
    String job;
    private double sal;

    public void m1() {

    }

    protected void m2() {

    }

    void m3() {

    }

    private void m4() {

    }
}
