package a05;

import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.GenericApplicationContext;

import java.io.IOException;

public class A05Application {
    public static void main(String[] args) throws IOException {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("config", Config.class);
        context.registerBean(ConfigurationClassPostProcessor.class);
        context.registerBean(MapperScannerConfigurer.class,bd -> {
            bd.getPropertyValues().add("basePackage", "com.atguigu.boot.a05.mapper");
        });

        context.refresh();

        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        context.close();
    }
}