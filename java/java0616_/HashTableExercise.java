package java0616_;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john",100);
      //  table.put(null,100);
      //  table.put("john",null);
        table.put("lucy",100);
        table.put("lic",100);
        table.put("lic",88);
        System.out.println(table);

    }

}
