package java0625_;

import java.io.*;

public class BufferedCopy02 {//演示使用

    public static void main(String[] args) {
        String srcFilePath = "e:\\Koala.jpg";
        String destFilePath = "e*\\hsp.jpg";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            byte[] buff = new byte[1024];
            int readLen = 0;
            //当返回一个-1文件关闭
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLen);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//关闭外层处理流
            if(bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
