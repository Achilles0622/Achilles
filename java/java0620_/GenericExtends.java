package java0620_;


import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<AAA> list2 = new ArrayList<>();
        ArrayList<BBB> list3 = new ArrayList<>();
        ArrayList<CCC> list4 = new ArrayList<>();
        ArrayList<Object> list5 = new ArrayList<>();
        printCollection1(list);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

    }

    public static void printCollection1(List<?> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    public static void printCollection2(List<? extends AAA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    public static void printCollection3(List<? super AAA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
}

class AAA {

}

class BBB extends AAA {

}

class CCC extends BBB {

}