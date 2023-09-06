package a01;

public class A01 {
    public static void main(String[] args) {


//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        //bean的定义(class，scope，初始化，销毁)
//        AbstractBeanDefinition beanDefinition =
//                BeanDefinitionBuilder.genericBeanDefinition(Config.class).setScope("singleton").getBeanDefinition();
//        beanFactory.registerBeanDefinition("config", beanDefinition);
//
//        AnnotationConfigUtils.registerAnnotationConfigProcessors(beanFactory);
//
//        beanFactory.getBeansOfType(BeanFactoryPostProcessor.class).values().stream().forEach(beanFactoryPostProcessor -> {
//            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
//        });
//        beanFactory.getBeansOfType(BeanPostProcessor.class).values().forEach(beanFactory::addBeanPostProcessor);
//
//        for (String name : beanFactory.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
//
//        beanFactory.preInstantiateSingletons();
//        System.out.println(beanFactory.getBean(Bean1.class).getBean2());
    }
}
