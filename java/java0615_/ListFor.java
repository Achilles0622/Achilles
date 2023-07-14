package java0615_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("may");
        list.add("miki");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);

        }
        System.out.println("---------------------");
        for (Object o : list) {
            System.out.println("o=" + o);
        }
        System.out.println("---------------------");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println("i="+list.get(i));

        }
    }
}
