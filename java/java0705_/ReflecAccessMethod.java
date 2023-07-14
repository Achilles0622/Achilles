package java0705_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> bossCls = Class.forName("java0705_.Boss");
        Object o = bossCls.newInstance();
        //Method hi = bossCls.getMethod("hi",String.class);
        Method hi = bossCls.getDeclaredMethod("hi", String.class);
        hi.invoke(o,"hsp");
        Method say = bossCls.getDeclaredMethod("say", String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(o,100,"张三",'男'));

    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi" + s);
    }
}
