package a11;

import org.springframework.cglib.proxy.Enhancer;

public class CglibProxyDemo {

    static class Target{
        public void foo(){
            System.out.println("target foo");
        }
    }
    //代理类是子类型，目标是父类型
    public static void main(String[] param) {
        Target target = new Target();

        Target proxy = (Target) Enhancer.create(Target.class, (MethodInterceptor) (p, method, args, methodProxy) -> {
            System.out.println("before...");
            //Object result = method.invoke(target, args);//用方法反射调用目标
            //methodProxy可以避免反射调用
            //Object result = methodProxy.invoke(target, args);//内部没有反射,需要目标
            Object result = methodProxy.invokeSuper(p, args);//内部没有反射，需要代理
            System.out.println("after...");
            return result;
        });

        proxy.foo();
    }
}