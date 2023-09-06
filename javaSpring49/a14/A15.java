package a14;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class A15 {

    public static void main(String[] args) {
        //1.备好切点
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* foo())");
        //2.备好通知
        MethodInterceptor advice = invocation -> {
            System.out.println("before...");
            Object result = invocation.proceed();//调用目标
            System.out.println("after...");
            return result;
        };
        //3.备好切面
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(pointcut,advice);
        /*
            4.创建代理

         */
        Target1 target1 = new Target1();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target1);
        factory.addAdvisor(advisor);
        I1 proxy = (I1) factory.getProxy();
        System.out.println(proxy.getClass());
        proxy.foo();
        proxy.bar();

    }

    interface I1{
        void foo();
        void bar();
    }

    static class Target1 implements I1{
        @Override
        public void foo() {
            System.out.println("target1 foo");
        }
        @Override
        public void bar() {
            System.out.println("target1 bar");
        }
    }

    static class Target2{

        public void foo() {
            System.out.println("target2 foo");
        }
        public void bar() {
            System.out.println("target2 bar");
        }
    }

}