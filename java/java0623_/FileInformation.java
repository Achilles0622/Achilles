package java0623_;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }
    //ファイルの情報を取る
    public void info(){
        File file = new File("e:\\news1.test");
        System.out.println("ファイルの名前＝"+file.getName());
        System.out.println("ファイルパス＝" +file.getAbsolutePath());
    }
}
