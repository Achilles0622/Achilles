package java0624_;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String scrFilePath = "e:\\Koala.jpg";
        String destFilePath="c:\\Koala.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(scrFilePath);
            fileOutputStream=new FileOutputStream(destFilePath);
            //定义字节数组 提高读取效率
            byte []buf=new byte[1024];
            int readLen=0;
            while ((readLen=fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,readLen );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileInputStream !=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(fileOutputStream !=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
