package java0627_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("scr\\mysql.properties"));
        properties.list(System.out);
//根据一个健获取key对应的植
        String user=properties.getProperty("user");
        properties.getProperty("pwd");
        System.out.println(" "+user);
        System.out.println(" ");

    }
}
