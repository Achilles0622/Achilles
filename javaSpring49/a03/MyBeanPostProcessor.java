package a03;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor, DestructionAwareBeanPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (beanName.equals("lifeCycleBean")){
            log.info("<<<<<< 销毁之前执行， 如@PreDestory");
        }
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("lifeCycleBean")){
            log.info("<<<<<< 实例化之前执行，这里返回的对象会替换原本的Bean");
        }
        //返回null保持原有对象不变
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("lifeCycleBean")){
            log.info("<<<<<< 实例化之后执行，这里如果返回false会跳过依赖注入阶段");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (beanName.equals("lifeCycleBean")){
            log.info("<<<<<< 依赖注入阶段，如@Autowired、@Value、@Resource");
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("lifeCycleBean")){
            log.info("<<<<<< 初始化之前执行，这里返回的对象会替换掉原本的bean，如@PostConstruct、@ConfigurationProperties");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("lifeCycleBean")){
            log.info("<<<<<< 初始化之后执行，这里返回的对象会替换掉原本的bean，如代理增强");
        }
        return bean;
    }
}