package java0628_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1创建一个DatagramSocket对象，来9999端口准备接受数
        DatagramSocket socket = new DatagramSocket(9999);
        //2构建一个DatagramPacket对象，准备接收数据,UDP协议时 最大64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3准备调用接受方法 填充到packet对象
        System.out.println("接收端等待数据接受");
        socket.receive(packet);
        //4可以把这个packet拆包取出数据并显示
        int length = packet.getLength();//实际接受数据长度
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);
        //5 关闭资源
        socket.close();
        System.out.println("A端退出");
    }
}
