package hspedu.extend;

import java.util.Arrays;
import java.util.Scanner;

public class Sub extends Base {
public Sub(String name,int age){
//1.老师想调用父辈无参数构造器，如下或者什么都不写，默认就是调用super（）；
    super("hsp",20);//父类午餐构造器，
    System.out.println("子类Sub（String name，int age）构造器调用");
}
    public Sub() {
        //super();//默认调用父类的无参构造器
        super("smith",10);
        System.out.println("sub().....");
    }
    public Sub(String name){
        super("tom",34);
        System.out.println("子类的sun构造器被调用");
    }
    public void sayOk() {
        //私有不可在子类中进行访问
        System.out.println(n1+" "+n2+" "+n3+" ");
        test1000();
        test2000();
        test3000();
        System.out.println("n4="+getN4());
    }
}
