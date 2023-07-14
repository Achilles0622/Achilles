package java0615_;

import java.util.Vector;

public class Vector01 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector="+vector);
    }
}
