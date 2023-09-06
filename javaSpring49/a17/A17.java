package a17;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.GenericApplicationContext;

public class A17 {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("aspect1", Aspect1.class);
        context.registerBean("config", Config.class);
        context.registerBean(ConfigurationClassPostProcessor.class);
        //BeanPostProcessor
        //创建 -> (*)依赖注入 -> 初始化(*)
        context.refresh();
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

    @Aspect //高级切面类
    static class Aspect1{
        @Before("execution(* foo())")
        public void before(){
            System.out.println("aspect1 before...");
        }

        @After("execution(* foo())")
        public void after(){
            System.out.println("aspect1 after...");
        }
    }

    @Configuration
    static class Config{
        @Bean //低级切面
        public Advisor advisor3(MethodInterceptor advice3){
            AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
            pointcut.setExpression("execution(* foo())");
            return new DefaultPointcutAdvisor(pointcut,advice3);
        }
        @Bean
        public MethodInterceptor advice3(){
            return invocation -> {
                System.out.println("advice3 before...");
                Object result = invocation.proceed();//调用目标
                System.out.println("advice3 after...");
                return result;
            };
        }
    }
}