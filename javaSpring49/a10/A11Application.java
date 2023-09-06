package a10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class A11Application {
    private static final Logger log = LoggerFactory.getLogger(A11Application.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(A11Application.class, args);
        MyService1 service1 = context.getBean(MyService1.class);

        //MyService并非代理，但foo方法增强了，做增强的java agent，在加载类时，修改了class字节码
        log.info("service1 class: {}",service1.getClass());
        service1.foo();
    }
}