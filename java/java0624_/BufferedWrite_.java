package java0624_;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ok.txt";
        //

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello1，韩顺平教育");
        bufferedWriter.newLine();
        bufferedWriter.write("hello2，韩顺平教育");
        bufferedWriter.write("hello3，韩顺平教育");
        bufferedWriter.close();
        //插入一个换行
    }
}
