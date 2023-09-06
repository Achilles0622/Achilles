package a12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMethodInvoke {

    public static void main(String[] args) throws Exception {
        Method foo = TestMethodInvoke.class.getDeclaredMethod("foo", int.class);
        for (int i = 0; i <= 17; i++) {
            show(i, foo);
            foo.invoke(null, i);
        }
        System.in.read();
    }

    private static void show(int i,Method foo)throws Exception{
        Method getMethodAccessor = Method.class.getDeclaredMethod("getMethodAccessor");
        getMethodAccessor.setAccessible(true);
        Object invoke = getMethodAccessor.invoke(foo);
        if (invoke == null) {
            System.out.println(i + ":" + null);
            return;
        }
        Field delegate = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl").getDeclaredField("delegate");
        delegate.setAccessible(true);
        System.out.println(i + ":" + delegate.get(invoke));
    }

    public static void foo(int i){
        System.out.println(i+":"+"foo");
    }
}
