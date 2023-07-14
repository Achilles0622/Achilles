package java0630_;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class QQServer {//这是服务器监听9999等待客户端连接保持通信
    private ServerSocket ss = null;

    public static void main(String[] args) {
        new QQServer();
    }

    public QQServer() {
        //注意端口可以写在配置文件
        System.out.println("服务端在9999端口监听");
        try {
            ss = new ServerSocket(9999);
            while (true) {//监听是循环的 当和某个客户端连接 继续进行
                Socket socket = ss.accept();
                //得到对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //得到socket关联的输出流

                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User u = (User) ois.readObject();
                //创建一个
                Message message = new Message();
                if (u.getUserID().equals("100") && u.getPasswd().equals("123456")) {
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将message对象回复
                    oos.writeObject(message);
                    //创建一个线程和这个客户端保持通讯,该线程需要持有socket对象
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, u.getUserID());
                    //启动线程
                    serverConnectClientThread.start();
                    //放入一个集合中进行管理
                    ManageClientThreads.addClientThread(u.getUserID(), serverConnectClientThread);
                } else {//登陆失败
                    System.out.println("登陆失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    //关闭socket
                    socket.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//如果服务端退出while，说明服务端不再继续监听了 需要关闭资源ServerSocket
            try {
                ss.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
