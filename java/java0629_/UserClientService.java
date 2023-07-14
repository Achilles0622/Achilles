package java0629_;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UserClientService {//完成登陆验证和注册等功能
    private User u = new User();//因为我们可能在其他地方使用user的信息因此做出成员属性
    private Socket socket;

    public boolean checkUser(String userId, String pwd) {
        boolean b = false;
        //根据账号和密码验证服务器是否存在
        //创建user对象
        u.setUserID(userId);
        u.setPasswd(pwd);
        //现在就可以连接服务端了
        try {
            socket = new Socket(InetAddress.getByName("192.168.1.107"), 9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);//发送user对象
            //读取从服务端回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();
            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {//OK

                //创建啊一个和服务区端保持通信的线程->再去创建一个类
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                clientConnectServerThread.start();
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);
                b = true;

            } else {
//如果登陆失败了怎么版,我们就不能启动服务器通讯线程了 ，所以要关闭socket
                socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return b;
    }
    //向服务器端请求在线用户列表
    public void  onlineFriendList(){
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
     //   ObjectOutputStream oos = new ObjectOutputStream(ManageClientThreads.getServerConnectClientThread(u.getUserID()).getSocket().getOutputStream());
    }
    //发送信息
}
