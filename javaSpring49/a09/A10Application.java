package a09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class A10Application {
    private static final Logger log = LoggerFactory.getLogger(A10Application.class);
    public static void main(String[] args) {

        new MyService().foo();
    }
}