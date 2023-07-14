package java0627_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //1连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回="+socket.getClass());
        //2连接上后生成Socket
        OutputStream outputStream = socket.getOutputStream();
        //3通过输出流写入数据到数据通道
        outputStream.write("hello,server".getBytes());
        //4关闭流
        outputStream.close();
        socket.close();
        System.out.println("客户端退出了 ");
    }

}
