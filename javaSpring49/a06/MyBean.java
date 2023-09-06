package a06;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

@Slf4j
public class MyBean implements BeanNameAware, ApplicationContextAware, InitializingBean {

    @Override
    public void setBeanName(String name) {
        log.debug("名字加"+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.debug("容器是"+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.debug("初始化...");
    }

    @Autowired
    public void aaa(ApplicationContext applicationContext){
        log.debug("使用@Autowired注入，容器是"+applicationContext);
    }

    @PostConstruct
    public void init(){
        log.debug("使用@PostConstruct初始化");
    }
}