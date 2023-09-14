package com.itheima32Aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class MyAdvice {
    @Pointcut("execution(void com.itheima32Aop.dao.BookDao.update())")
    private void  pt(){}
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
