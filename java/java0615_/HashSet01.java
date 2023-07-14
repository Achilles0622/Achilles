package java0615_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet=" + hashSet);
//HashSet只能放一个null，不可以放多个相同数值
    }
}
