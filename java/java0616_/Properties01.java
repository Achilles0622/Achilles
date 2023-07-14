package java0616_;

import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john", 100);
     //   properties.put(null, 100);
    //    properties.put("john", null);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 80);
        System.out.println(properties);
        System.out.println(properties.get("lic"));
        properties.remove("lic");
        System.out.println(properties);
    }
}
