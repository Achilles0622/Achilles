package a11;

public class JdkProxyDemo {

    interface Foo{
        void foo();
    }

    static class Target implements Foo{
        @Override
        public void foo() {
            System.out.println("target foo");
        }
    }
    //jdk 只能针对接口进行代理
    public static void main(String[] param) {
        //目标对象
        Target target = new Target();
        ClassLoader loader = JdkProxyDemo.class.getClassLoader();//用来加载在运行期间动态生成的字节码
        // new Class[]{Foo.class}:代理类要实现的接口  InvocationHandler：代理类调用方法时要执行的行为
        Foo foo = (Foo) Proxy.newProxyInstance(loader, new Class[]{Foo.class}, (proxy, method, args) -> {
            System.out.println("before...");
            //方法.invoke(目标，参数)
            Object result = method.invoke(target, args);
            System.out.println("after...");
            return result;//让代理也返回目标方法执行的结果
        });

        foo.foo();
    }
}