package java0616_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "韩顺平");
        map.put("no2", "zwj");
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for(Object entry:set){
            System.out.println(entry.getClass());
        }
    }

}
