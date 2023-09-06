import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class A03 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(A03.class, args);
        context.close();
    }
}