package A19;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;
import java.util.Objects;

public class A19 {
    @Aspect
    static class MyAspect {
        @Before("execution(* foo(..))")
        public void before1() {
            System.out.println("before1");
        }

        @Before("execution(* foo(..)) && args(x)")
        public void before(int x) {
            System.out.printf("before(%d)%n", x);
        }
    }

    static class Target {
        public void foo(int x) {
            System.out.printf("foo(%d)%n", x);
        }
    }

    @Configuration
    static class MyConfig {
        @Bean
        AnnotationAwareAspectJAutoProxyCreator proxyCreator() {
            return new AnnotationAwareAspectJAutoProxyCreator();
        }

        @Bean
        public MyAspect myAspect() {
            return new MyAspect();
        }
    }

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean(ConfigurationClassPostProcessor.class);
        context.registerBean(MyConfig.class);
        context.refresh();
        AnnotationAwareAspectJAutoProxyCreator creator = context.getBean(AnnotationAwareAspectJAutoProxyCreator.class);
        List<Advisor> list = creator.findEligibleAdvisors(Target.class);
        Target target = new Target();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvisor(list.get(0)); // 修正了添加Advisor的方式
        Object proxy = factory.getProxy();

        List<Object> interceptorList = factory.getInterceptorsAndDynamicInterceptionAdvice(Target.class, Target.class.getMethod("foo", int.class));
        for (Object o : interceptorList) {
            System.out.println(o);
        }
    }
}
