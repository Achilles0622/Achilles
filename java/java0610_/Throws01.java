package java0610_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }

    public void f2() throws FileNotFoundException {
        //创建了文件流
        FileInputStream ifs=new FileInputStream("d://a.txt");
    }
}