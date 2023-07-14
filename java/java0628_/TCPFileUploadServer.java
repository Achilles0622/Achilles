package java0628_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //1在服务端本机监听8888
       ServerSocket serverSocket=new ServerSocket(8888);
       //2等待连接
        Socket socket=serverSocket.accept();
        //3读取客户端发送的数据
        //通过socket得到一个输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //4得到bytes数组 写入指定路径 就能得到一个文件了
        String destFilePath=" ";//此处填写获得的路径
       BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
       bos.write(bytes);
       bos.close();//关闭其他资源
        //想客户端回复“收到图片”
        //通过socket获取到输出流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush();//把内容刷新到数据通道
        socket.shutdownOutput();//设置写入结束标记
        writer.close();
        bis.close();
        socket.close();
        serverSocket.close();

    }
}
