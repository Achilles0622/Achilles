package java0629_;

public interface MessageType {//表示消息类型,在接口定义了一些常量，表示不同消息类型
    String MESSAGE_LOGIN_SUCCEED = "1";//表示登陆成功了
    String MESSAGE_LOGIN_FAIL = "2";//表示登陆失败了

    String MESSAGE_COMM_MES = "3";//普通信息包
    String MESSAGE_GET_ONLINE_FRIEND = "4";//要求返回在线用户列表
    String MESSAGE_RET_ONLINE_FRIEND = "5";
    String MESSAGE_CLIENT_EXIT = "6";
}
