package java0627_;

import java0603_.Professor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty(" charset","utf8");
        properties.setProperty(" user","tom");
        properties.setProperty("pwd","abc111");
        properties.store(new FileOutputStream("src\\mysql2.properties"),null);
        System.out.println("保存成功" );
    }
}
