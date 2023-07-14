package java0624_;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderr_ {
    public static void main(String[] args) throws Exception {
        String filePath="e:\\a.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        //读取
        String line;

      while((line= bufferedReader.readLine())!=null){
          System.out.println(line);
      }
      bufferedReader.close();
    }
}
