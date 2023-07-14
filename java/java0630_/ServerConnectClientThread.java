package java0630_;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerConnectClientThread extends Thread {
    //该类对象对象和某个客户度保持连接通讯
    private Socket socket;
    private String userId;//连接到服务端用户id

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;

    }

    @Override
    public void run() {//线程处于run状态发送或者接受消息
        while (true) {
            System.out.println("服务端和客户端"+userId+" 读取数据中");
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                //后面会使用message
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Socket getSocket() {
        return null;
    }
}
