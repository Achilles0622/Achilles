package java0615_;

import java.util.HashSet;
import java.util.Set;

public class SetMethod01 {
    public static void main(String[] args) {
         Set set=new HashSet();
         set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println("set="+set);

    }
}
