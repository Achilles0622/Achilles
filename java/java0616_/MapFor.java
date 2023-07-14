package java0616_;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", new Book("", 100));
        map.put("邓超", "孙俪");
        map.put("王宝强", "马融");
        map.put("宋吉", "马融");
        map.put("刘凌波", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");
        Set keyset = map.keySet();
        System.out.println("----------1-------------");
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("------------2--------------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("------");
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);

        }
        System.out.println("---------");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }
        Set entrySet = map.entrySet();
        System.out.println("---------for--------------");
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }

    }
}
