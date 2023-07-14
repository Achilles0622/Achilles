package java0615_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zsf");
        list.add("jby");
        list.add(1, "hsp");
        System.out.println("list=" + list);
        List list1 = new ArrayList();
        list1.add("jack");
        list1.add("tom");
        list.addAll(1, list1);
        System.out.println("list=" + list);
        System.out.println(list1.indexOf("tom"));
        list.remove(0);
        System.out.println("list=" + list);
        list.set(1,"mary");
        System.out.println("list=" + list);
        List list2 = list.subList(0, 2);
        System.out.println("list2="+list2);


    }
}
