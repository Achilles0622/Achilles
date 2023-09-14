package com.itheima32Aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.itheima32Aop")
@EnableAspectJAutoProxy
public class SpringConfig {
}
