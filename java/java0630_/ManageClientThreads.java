package java0630_;

import java.util.HashMap;

public class ManageClientThreads {//该类用于管理和客户端通讯的线程
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();
    //添加线程对象加入hm集合
    public static void addClientThread(String userId,ServerConnectClientThread serverConnectClientThread){
        hm.put(userId,serverConnectClientThread);

    }
    //根据和这个userId返回线程
    public  static ServerConnectClientThread getServerConnectClientThread(String userId){
        return hm.get(userId);
    }
}
