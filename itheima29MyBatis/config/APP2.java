package com.itheima29MyBatis.config;

import com.itheima29MyBatis.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);
        Account ac=accountService.findById(1);
        System.out.println(ac);
    }
}
