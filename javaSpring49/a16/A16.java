package a16;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;

public class A16 {
    public static void main(String[] args) throws NoSuchMethodException {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* bar())");
        //根据名字进行方法匹配
        System.out.println(pointcut.matches(T1.class.getMethod("foo"), T1.class));
        System.out.println(pointcut.matches(T1.class.getMethod("bar"), T1.class));
        //根据方法上注解进行匹配
        AspectJExpressionPointcut pointcut1 = new AspectJExpressionPointcut();
        pointcut1.setExpression("@annotation(org.springframework.transaction.annotation.Transactional)");
        System.out.println(pointcut1.matches(T1.class.getMethod("foo"), T1.class));
        System.out.println(pointcut1.matches(T1.class.getMethod("bar"), T1.class));
    }