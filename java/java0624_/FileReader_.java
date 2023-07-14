package java0624_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        String filePath="e:\\story.txt";
        FileReader fileReader=null;
        int data=' ';
        try {
            fileReader=new FileReader(filePath);
            while((data=fileReader.read())!=-1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
