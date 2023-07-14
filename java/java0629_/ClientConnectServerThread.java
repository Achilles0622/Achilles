package java0629_;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnectServerThread extends Thread {
    //该线程需要持有Socket
    private Socket socket;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //因为我们线程需要在后台和服务器通讯因此做出无限循环
        while (true) {
            System.out.println("等待消息");
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message=(Message) ois.readObject();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


    public Socket getSocket() {
        return socket;
    }
}
