package java0615_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
      List list = new ArrayList();
        for (int i = 0; i <12 ; i++) {
            list.add("hello"+i);

        }
        System.out.println("list="+list);
        list.add(1,"hspjy");
        System.out.println("list="+list);
        System.out.println("第五个元素="+list.get(4));
        list.remove(5);
        System.out.println("list="+list);
        list.set(6,"sgyy");
        System.out.println("list="+list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj="+next);
            
        }
    }
}
