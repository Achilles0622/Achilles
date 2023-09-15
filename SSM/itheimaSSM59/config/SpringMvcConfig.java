package com.itheimaSSM59.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.itheimaSSM59.controller")
@EnableWebMvc
public class SpringMvcConfig {

}
