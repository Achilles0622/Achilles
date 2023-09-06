package a09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service

public class MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);

    public void foo(){
        log.debug("foo");
    }

}
