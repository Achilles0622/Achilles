package java0603_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //化繁为简
    //1.完成显示菜单
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "-------------零钱通明细-----------------";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd hh:mm");
        //定义新的变量
        String note = "";
        do {
            System.out.println("\t -------零钱通菜单------");
            System.out.println("\t\t\t1零钱通明细");
            System.out.println("\t\t\t2收益和入账");
            System.out.println("\t\t\t3消费的明细");
            System.out.println("\t\t\t4退     出");
            System.out.println("请选择（1-4) ");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("2收益和入账金额:");
                    money = scanner.nextDouble();
//                    if (money <= 0) {
//                        System.out.println("收益入账金额范围需要大于0");
//                        break;
//                    if(){
//                        System.out.println("xxx");
//                        break;
//                    }
                    if (money > 0) {
                        balance += money;
                        date = new Date();
                        // System.out.println(sdf.format(date));
                        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;

                    } else {
                        System.out.println("收益金额需要大于0 ");

                    }
                    break;
                case "3":
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();
                    if(money<=0||money>balance){
                        System.out.println("消费金额应该在0到余额之间");
                    }
                    System.out.println("消费说明");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;

                case "4":
                    String choice = "";
                    while (true) {
                        System.out.println("你确定要退出么？y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                    }

                    break;
                default:
                    System.out.println("选择有误");
            }
        } while (loop);
        System.out.println("------退出了零钱通项目---------");
    }
}
