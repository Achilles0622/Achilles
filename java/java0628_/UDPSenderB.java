package java0628_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1创建DatagramSocket对象，准备9998接受数据
        DatagramSocket socket = new DatagramSocket(9998);
        //2将需要发送的数据封装到DatagramPacket
        byte[] data = "hello 明天吃火锅".getBytes();
        //封装的这个对象 内容字节数组 data length 主机（ip），端口
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.103"), 9999);
        socket.send(packet);
        socket.close();
        System.out.println("B端退出");
    }
}
