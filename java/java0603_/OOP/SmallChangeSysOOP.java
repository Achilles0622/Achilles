package java0603_.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
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

    public void mainMenu() {
        System.out.println("显示零钱通菜单");
    }

    public void detail() {
        System.out.println(details);
    }

    public void income() {
        System.out.println("2收益和入账金额:");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益入账金额范围需要大于0");
            return;
        }
        balance += money;
        date = new Date();
        // System.out.println(sdf.format(date));
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;

    }
    public void pay (){
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        if(money<=0||money>balance){
            System.out.println("消费金额应该在0到余额之间"+balance);
            return;
        }
        System.out.println("消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    public void exit(){
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
//
//        break;
//        default:
//        System.out.println("选择有误");
    }
    }





