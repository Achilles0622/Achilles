package java0627_;

import java.io.File;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
   String directoryPath="e:\\mytemp";
        File file = new File(directoryPath);
        if(!file.exists()){
            if(file.mkdirs()) {
                System.out.println("创建" + directoryPath + " 成功");
            }else{
                System.out.println("创建" + directoryPath + " 失败");

            }
        }
        String  filePath=directoryPath+"\\hello.txt";
        file=new File(filePath);
        if(!file.exists()){
            if(file.createNewFile()) {
                System.out.println(filePath+" ");
            }else{
                System.out.println(filePath+" ");
            }
        }else{
            System.out.println(filePath+"已经存在");
        }
    }
}
