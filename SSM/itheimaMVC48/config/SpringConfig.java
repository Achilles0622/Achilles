package com.itheimaMVC48.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.itheimaMVC48.service", "com.itheimaMVC48.dao"})
public class SpringConfig {
}
