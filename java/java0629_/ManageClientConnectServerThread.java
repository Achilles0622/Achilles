package java0629_;

import java.util.HashMap;

public class ManageClientConnectServerThread {
    //我们把多个线程放入Hashmap集合当中,key就是用户id，value是线程

    private static HashMap<String,ClientConnectServerThread>hm=new HashMap<>();
    //将某个线程加入集合当中
    public static void addClientConnectServerThread(String userId,ClientConnectServerThread clientConnectServerThread){
        hm.put(userId,clientConnectServerThread);
    }
    //通过一个方法userId可以诶到线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId){
        return hm.get(userId);
    }
}
