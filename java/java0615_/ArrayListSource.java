package java0615_;

import java.util.ArrayList;

public class ArrayListSource {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        ArrayList list=new ArrayList(8);
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);

        }
        list.add(100);
        list.add(200);
        list.add(null);
        for (Object object : list) {
            System.out.println(object);
        }

    }
}
