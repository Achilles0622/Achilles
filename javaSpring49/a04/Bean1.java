package a04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Slf4j
public class Bean1 {

    private Bean2 bean2;

    @Autowired
    public void setBean2(Bean2 bean2){
        log.debug("@Autowired生效：{}",bean2);
        this.bean2 = bean2;
    }

    @Autowired
    private Bean3 bean3;

    @Resource
    public void setBean3(Bean3 bean3){
        log.debug("@Resource 生效：{}",bean3);
        this.bean3 = bean3;
    }

    private String home;

    @Autowired
    public void setHome(@Value("${CATALINA_HOME}") String home){
        log.debug("@Value生效：{}",home);
        this.home = home;
    }

    @PostConstruct
    public void init(){
        log.debug("@PostConstruct生效");
    }

    @PreDestroy
    public void Destroy(){
        log.debug("@PreDestroy生效 ");
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "bean2=" + bean2 +
                ", bean3=" + bean3 +
                ", home='" + home + '\'' +
                '}';
    }
}


public class Bean2 {
}

public class Bean3 {
}

@ConfigurationProperties(prefix = "catalina")
public class Bean4 {

    private String home;
    private String base;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Bean4{" +
                "home='" + home + '\'' +
                ", base='" + base + '\'' +
                '}';
    }
}