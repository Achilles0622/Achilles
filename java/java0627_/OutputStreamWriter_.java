package java0627_;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath="e:\\hsp.txt";
        String charSet="gdk";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), "gbk");
        osw.write("hi,韩顺平");
        osw.close();
        System.out.println("保存文件");
    }
}
