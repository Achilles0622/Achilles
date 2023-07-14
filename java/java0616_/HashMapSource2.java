package java0616_;

import java.util.HashMap;
import java.util.Objects;

public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        for (int i = 0; i <12 ; i++) {
            hashMap.put(new A(i),"hello");
            
        }
        System.out.println("hashMap="+hashMap);
    }
}
class A {
    private int no;

    public A(int no) {
        this.no = no;
    }


    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "no=" + no +
                '}';
    }
}
