package a10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService1 {

    private static final Logger log = LoggerFactory.getLogger(MyService1.class);

    final public void foo(){
        log.info("foo()");
        bar();
    }

    public void bar(){
        log.info("bar()");
    }

}
