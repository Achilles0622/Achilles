package com.itheimaMVC48;

import com.itheimaMVC48.config.SpringConfig;
import com.itheimaMVC48.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));

    }
}
