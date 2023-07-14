package java0628_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //客户端连接服务器端，得到Socket
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //创建读取磁盘的文件输入流
        String filePath = " ";//此处填写输入流的图片地址
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //通过socket获取输出流，发给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//将文件对应字节数组内容写入数据通道
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标志，不写结束 容易卡顿
        //关闭相关的流
        //----------------------接受从服务端来的消息
        InputStream inputStream = socket.getInputStream();
        //用StreamUtils的方法 直接转换字符串

        bos.close();
        socket.close();
    }
}
