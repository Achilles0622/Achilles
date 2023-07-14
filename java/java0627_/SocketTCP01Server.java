package java0627_;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
     //1在本机9999端口监听等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听等待连接");
        //2当没有程序在连接9999端口，程序会阻塞，等待链接
        Socket socket = serverSocket.accept();
        //3通过socket.getInputStream（）读取，客户端写入到数据通道数据，显示
        System.out.println("服务器端socket="+ socket.getClass());
        InputStream inputStream=socket.getInputStream();
        //4IO读取
        byte[]buf=new byte[1024];
        int readLen=0;
        while((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
        //5关闭流
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
