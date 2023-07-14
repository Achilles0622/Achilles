package java0615_;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("miki");
        list.add("mary");
        System.out.println("list="+list);
        System.out.println(list.get(3));
    }
}
