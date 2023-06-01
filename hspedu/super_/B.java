package hspedu.super_;

public class B extends A{
    public int n1=888;
    public void hi (){
        System.out.println(super.n1+"   "+super.n2+"   "+super.n3+"   ");//n4是私有访问
    }
    public void cal() {
        System.out.println("b类的方法cal（）");
    }
    public void sum(){
        System.out.println("B类求和的一个sum方法");
        //希望调用父类A的cal方法
        //这是因为子类B没有cal方法，因此我可以使用下面三种方式
       // cal();//找cal方法时候，顺序是先找本类，如果有可以调用，则调用，如果没有则找父类（如果有并可以调用则调用）……
        //如果父类没有，则找爷爷类，整个规则就是一样的
        //this.cal();
        super.cal();//直接查找父类然后再往下寻找其他逻辑规则一样
        //演示访问属性的规则
        System.out.println(n1);//n1和this查找规则是一样的
        System.out.println(this.n1);
        System.out.println(super.n1);
    }
    public void  ok() {//不可访问父类私有方法
        super.test100();
        super.test200();
        super.test300();
    }
    public B(){
        super("jack",10);

    }
}
