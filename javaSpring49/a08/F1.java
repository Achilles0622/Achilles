package a08;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class F1 {

}

@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class F2 {

}

@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class F2 {

}

@Scope("prototype")
@Component
public class F4 {

}