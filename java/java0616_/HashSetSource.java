package java0616_;

import java.util.HashSet;

public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");//因为重复所以加不进去
        System.out.println("set="+hashSet);
    }
}
