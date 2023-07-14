package java0705_;

import java.lang.reflect.Field;

public class ReflecAccessProperty {//演示访问或者操作的属性

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//得到student类对应的class对象
        Class<?> stuClass = Class.forName("java0705_.Student");
        Object o = stuClass.newInstance();
        System.out.println(o.getClass());
        Field age = stuClass.getField("age");
        age.set(o,88);
        System.out.println(o);
        System.out.println(age.get(o));
        Field name = stuClass.getDeclaredField("name");
        //对name爆破
        name.setAccessible(true);
        name.set(o,"老韩");
        System.out.println(o);
    }
}
class Student{
    public int age;
    private static String name;
    public Student(){

    }
    public String toString(){
        return "Studen[age="+age+",name="+name+"]";
    }
}
