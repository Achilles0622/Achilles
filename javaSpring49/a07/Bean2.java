package a07;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

@Slf4j
public class Bean2 implements DisposableBean {

    @PreDestroy
    public void destroy1(){
        log.debug("销毁1");
    }

    @Override
    public void destroy() throws Exception {
        log.debug("销毁2");
    }

    public void destroy3(){
        log.debug("销毁3");
    }
}