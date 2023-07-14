package java0627_;

import java0624_.BufferedReader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        String filePath="e:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String s=br.readLine();
        System.out.println("输出内容"+s);
        br.close();
    }
}
