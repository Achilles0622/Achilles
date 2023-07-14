package java0615_;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("blakc",3));
        list.add(new Dog("yello",8));
        list.add(new Dog("nice",100));

        for(Object dog:list){
            System.out.println("dog="+dog);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object dog = iterator.next();
            System.out.println("dog="+dog);
        }


    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

}