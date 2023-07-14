package java0616_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");
        list.add("tom");


        java.util.Collections.reverse(list);
        System.out.println("list="+list);
        for (int i = 0; i <6 ; i++) {
            java.util.Collections.shuffle(list);
            System.out.println(list);
            java.util.Collections.sort(list);}
            System.out.println("-----");
            System.out.println(list);
        System.out.println("--------");
        java.util.Collections.swap(list,0,1);
        System.out.println("list="+list);
        System.out.println("自然元素最大的是"+ java.util.Collections.max(list));
        System.out.println("tom出现次数" + java.util.Collections.frequency(list,"tom"));
        ArrayList dest = new ArrayList();
        for (int i=0;i<list.size();i++){
            dest.add(" ");
        }
        java.util.Collections.copy(dest,list);
        System.out.println("dest="+dest);
        java.util.Collections.replaceAll(list,"tom","汤姆");
        System.out.println("list="+list);

    }
}
