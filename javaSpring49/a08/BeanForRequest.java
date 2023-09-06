package a08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Scope("request")
@Slf4j
@Component
public class BeanForRequest {

    @PreDestroy
    public void destroy(){
        log.info("destroy");
    }

}



@Component
@Scope("session")
public class BeanForSession {

    @PreDestroy
    public void destroy(){
        log.info("destroy");
    }

}


@Component
@Scope("application")
public class BeanForApplication {

    @PreDestroy
    public void destroy(){
        log.info("destroy");
    }

}