package java0609_;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings {
    @java.lang.SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack ");
        list.add("tom ");
        list.add("mary ");
        int i;

        System.out.println(list.get(1));
    }
}
