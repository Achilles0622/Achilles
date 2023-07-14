package java0624_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath="e:\\note.txt";
        FileWriter fileWriter=null;
        char[]chars={'a','b','c'};
        try {
            fileWriter=new FileWriter(filePath);
            //3.写入单个字符
            fileWriter.write('H');
            //4.写入指定数组
            fileWriter.write(chars);
            //5.写入指定部分数组
            fileWriter.write("韩顺平教育".toCharArray(),0,3);
            //6.写入整个字符串
            fileWriter.write("hello,beijing");
            //7.写入字符串指定部分
            fileWriter.write("上海天津",0,2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("程序结束了");
    }
}
