package a06;

import org.springframework.context.support.GenericApplicationContext;

/**
 * Aware接口及InitializingBean接口
 */
public class A06Application {
    public static void main(String[] args) {

        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("myBean", MyBean.class);
        context.refresh();//1.beanFactory后处理器 2.添加Bean后处理器 3.初始化单例
        context.close();
    }
}