package java0629_;

public class QQView {
    private UserClientService userClientService = new UserClientService();//这个对象用于登陆服务器的 /注册用户的
    private boolean loop = true;
    private String key = " ";

    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("客户端退出了系统");
    }

    private void mainMenu() {
        while (loop) {
            System.out.println("=============欢迎登陆网络通信系统==================");
            System.out.println("\t\t1登陆系统");
            System.out.println("\t\t9退出系统");
            System.out.printf("输入选择");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    System.out.print("登陆系统,输入用户号");
                    String userId = Utility.readString(50);
                    System.out.print("请输入密码");
                    String pwd = Utility.readString(50);
                    //需要验证用户是否合法存在，这里存在大量代码
                    if (userClientService.checkUser(userId, pwd)) {//先把逻辑打通，然后再调用方法
                        System.out.printf("==========欢迎" + userId + "==============");
                        //进入二级菜单
                        while (loop) {
                            System.out.println("\n========网路通信二级菜单(用户" + userId + ")=============");
                            System.out.println("\t\t 1显示在线用户列表");
                            System.out.println("\t\t 2群发消息");
                            System.out.println("\t\t 3私聊消息");
                            System.out.println("\t\t 4发送文件");
                            System.out.println("\t\t 9退出系统");
                            System.out.print("清输入你的选择");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                   //System.out.println("显示用户在线列表");
                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.println("私聊消息");
                                    break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    loop = false;
                                    System.out.println("退出系统");
                                    break;
                            }
                        }
                    } else {//登陆服务器失败了
                        System.out.println("-------登陆失败了--------");

                    }
                    break;
                case "9":
                    loop = false;
                    System.out.println("退出系统");
                    break;
            }
        }
    }
}