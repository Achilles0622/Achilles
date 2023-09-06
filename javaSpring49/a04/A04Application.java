package a04;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class A04Application {
    public static void main(String[] args) {
        //GenericApplicationContext是一个【干净的容器】,默认不会添加任何后处理器
        GenericApplicationContext context = new GenericApplicationContext();

        //用原始的方法注册三个bean
        context.registerBean("bean1", Bean1.class);
        context.registerBean("bean2", Bean2.class);
        context.registerBean("bean3", Bean3.class);
        context.registerBean("bean4", Bean4.class);

        //添加解析@Value的解析器
        context.getDefaultListableBeanFactory().setAutowireCandidateResolver(new ContextAnnotationAutowireCandidateResolver());
        //添加解析Autowired @Value 后处理器
        context.registerBean(AutowiredAnnotationBeanPostProcessor.class );
        //添加解析@Resource @PostConstruct @PreDestroy 的后处理器
        context.registerBean(CommonAnnotationBeanPostProcessor.class);
        //添加解析@ConfigurationProperties的后处理器
        ConfigurationPropertiesBindingPostProcessor.register(context.getDefaultListableBeanFactory());

        //初始化容器
        context.refresh();//执行BeanFactory后处理器，添加bean后处理器，初始化所有单例

        System.out.println(context.getBean(Bean4.class));
        //销毁容器
        context.close();
    }
}