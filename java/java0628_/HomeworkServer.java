package java0628_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeworkServer {
    public static void main(String[] args) throws Exception {
        //1先创建socket监听9999等待客户端连接并发送下载文件名称
        ServerSocket serverSocket = new ServerSocket(9999);
        //2等待客户联机
        Socket socket = serverSocket.accept();
        //3读取客户要发送的文件
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downloadFileName = " ";
        while ((len = inputStream.read(b)) != -1) {
            downloadFileName += new String(b, 0, len);
        }
        System.out.println("希望下载文件名字=" + downloadFileName);
        String resFileName = " ";
        if ("高山流水".equals(downloadFileName)) {
            resFileName = "src\\高山流水";
        } else {
            resFileName = "src\\无名";

        }
        //4
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
        //5使用工具类读取文件到一个数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //6得到socket关联输出流
        BufferedOutputStream bos
                = new BufferedOutputStream(socket.getOutputStream());
        //7返回数据通道
        bos.write(bytes);
        //8关闭相关资源
        bis.close();
        bos.close();
        socket.shutdownOutput();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出" );
    }
}
