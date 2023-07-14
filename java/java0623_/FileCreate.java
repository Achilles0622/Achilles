package java0623_;


import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
    }
    //方式1
    public void create01(){
        String filePath="e:\\news1.txt";
        File file=new File(filePath);
        try {
            file.createNewFile();
            System.out.println("ファイルの作成した");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void create02(){
        File parentFile = new File("e:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("ファイルの作成した");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
