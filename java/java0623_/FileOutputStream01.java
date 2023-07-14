package java0623_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String filePath="e:\\a.txt" ;
        FileOutputStream fileOutputStream=null;
        try {//得到一个对象
            fileOutputStream=new FileOutputStream(filePath);
          //  fileOutputStream.write('H');写一个字节
            String str="hello ,world";
            //str.getBytes字符串转成字迹数组
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
        }

    }
}
