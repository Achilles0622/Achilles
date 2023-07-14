package java0614_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list" + list);
        list.remove("jack");
        System.out.println("lise" + list);
        System.out.println(list.contains(10));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
      //  list.clear();
        ArrayList list2 = new ArrayList();
        list2.add("nice");
        list2.add("good");
        list.addAll(list2);
        System.out.println("list="+list);
        System.out.println(list.containsAll(list2));
        list.add("very good");
        list.removeAll(list2);
        System.out.println(list);


    }
}
