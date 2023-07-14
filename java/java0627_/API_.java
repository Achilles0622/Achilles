package java0627_;
import  java.net.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1获取本季的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//emutinoMBP/192.168.1.103
        //2根据获取主机名获取InetAddress对象
        InetAddress host1=InetAddress.getByName("emutinoMBP");
        System.out.println("host1="+host1);
        //3根据域名返回 InetAddress低哦心
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2="+host2);
        //4通过InetAddress对象获取对应地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2对应的ip"+hostAddress);
        //5通过InetAddress对象，来获取对象主机名和域名
        String hostName=host2.getHostName();
        System.out.println("host2对应的主机名或者域名"+hostName);

    }
}
