package java0628_;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class StreamUtils {


    public static byte[]streamToByteArray(InputStream is)throws Exception{
        ByteArrayOutputStream bos=new ByteArrayOutputStream();//创建输出流对象
        byte[]b=new byte[1024];//字节数组
        int len ;
        while((len=is.read(b))!=-1){//循环读取
            bos.write(b,0,len);//写入bos
        }
        byte[]array=bos.toByteArray();//然后转换字节数组
        bos.close();
        return  array;

    }
}
