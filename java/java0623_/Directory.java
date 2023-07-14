package java0623_;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory {
    public static void main(String[] args) {


    }
    @Test
    public void m1(){
    String filePath="d:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()) {
           if (file.delete()){
               System.out.println("ファイルを削除に成功した");
           }
        }else{
            System.out.println("このファイルは存在しない" );
        }
    }
}
