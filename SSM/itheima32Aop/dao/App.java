package com.itheima32Aop.dao;

import com.itheima32Aop.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao booDao = ctx.getBean(BookDao.class);
        booDao.update();
    }
}
