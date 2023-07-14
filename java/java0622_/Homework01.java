package java0622_;

import java.util.Scanner;
import java.util.TreeMap;

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}

class A extends Thread {
    private boolean loop = true;

    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    public void run() {
        //接收到用户输入
        while (true) {
            System.out.println("请输入你的指令");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //以同通知方式结束
                a.setLoop(false);
                System.out.println("b线程已经退出");
                break;
            }
        }
    }
}