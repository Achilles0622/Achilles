package java0616_;

import java.util.HashMap;
import java.util.Map;

public class map01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","韩顺平");
        map.put("no2","hsp");
        map.put("no3","zsf");
        map.put(null,null);
        map.put(null,"abc");
        map.put("no4",null);
        map.put("no5",null);
        map.put(1,"zm");


        System.out.println("map="+map);

    }
}
