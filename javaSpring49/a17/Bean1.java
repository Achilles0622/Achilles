package a17;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

static class Bean1{
    public void foo(){}
    public Bean1(){
        System.out.println("Bean1()");
    }
    @Autowired
    public void setBean2(Bean2 bean2){
        System.out.println("Bean1 setBean2(bean2) class is:"+bean2.getClass());
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean1 init()");
    }
}