package a12;

import java.lang.reflect.Constructor;

public class TestProxy {
    public static void main(String[] args) throws Exception {
        byte[] dump = $Proxy0Dump.dump();

        ClassLoader loader = new ClassLoader() {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                return super.defineClass(dump,0,dump.length);
            }
        };

        Class<?> proxyClass = loader.loadClass("com.itheima.asm.$Proxy1");
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        Foo proxy = (Foo) constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before...");
                System.out.println("调用目标");
                return null;
            }
        });
        proxy.foo();
    }

}
