package java0617_;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //给我们泛型制动数据类型是引用类型，不能是基本数据类型
        //ArrayList<int> list2 = new ArrayList<int>();
        //int是基本类型
        ArrayList<A> al = new ArrayList<>();
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();
        //传入该类型的子类是可以的
        //使用形式如下
        List<Integer>list1=new ArrayList<Integer>();
        //简化形式
        ArrayList<Integer> list2=new ArrayList<>();
        //若果这样写默认是Object
        ArrayList arrayList = new ArrayList();//等价ArrayList<Object> arrayList = new ArrayList();
        arrayList.add("xx");
        Tiger tiger = new Tiger();

    }
}
class Tiger<E>{
    E e;
public Tiger(){}
    public Tiger(E e) { 
        this.e = e;
    }
}
class A {
}

class B extends A {
}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}