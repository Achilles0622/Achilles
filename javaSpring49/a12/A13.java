import a12.$Proxy0;

import java.lang.reflect.InvocationTargetException;

public class A13 {

    interface Foo{
        void foo();
        void bar();
    }

    static class Target implements Foo{
        @Override
        public void foo() {
            System.out.println("target foo");
        }

        @Override
        public void bar() {
            System.out.println("target bar");
        }
    }

    interface InvocationHandler{
        void invoke(Method method,Object[] args) throws Throwable;
    }

    public static void main(String[] param) {
        Foo proxy = new $Proxy0(new InvocationHandler() {
            @Override
            public void invoke(Method method,Object[] args) throws InvocationTargetException, IllegalAccessException {
                //1.功能增强
                System.out.println("before...");
                //2.调用目标
                method.invoke(new Target(), args);
            }
        });
        proxy.foo();
        proxy.bar();
    }
}