package java0620_;


import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100);//当调用方法时候编译器就会确定类型
        Fish<String, ArrayList>fish=new Fish<>();
        fish.hello(new ArrayList(),11.3f);
    }
}

class Car {
    public void run() {
    }
    public <T, R> void fly(T t, R r) {//泛型方法做成
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
class Fish<T,R>{
    public void run(){
    }
    public <U,M> void eat(U u ,M m ){

    }
    public void hi(T t){

    }
    public <K> void  hello (R r,K k ){
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}
