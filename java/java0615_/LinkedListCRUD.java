package java0615_;

import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList="+linkedList);
        linkedList.remove();
       // linkedList.remove(2);
        System.out.println("linkedList="+linkedList);


    }
}
