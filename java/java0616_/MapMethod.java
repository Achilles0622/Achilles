package java0616_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超","孙俪");
        map.put("王宝强","马融");
        map.put("宋吉","马融");
        map.put("刘凌波",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");
        System.out.println("map="+map);
        map.remove(null);
        System.out.println("map="+map);
        System.out.println("k-v="+map.size());
        System.out.println(map.isEmpty());

    }
}
class Book{
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }
}