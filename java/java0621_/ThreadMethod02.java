package java0621_;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        t3.start();
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println(" 主线程吃了" + i + "包子");
            if(i==5){
                System.out.println("主线让自线程多吃包子");
                t3.join();
                System.out.println("自线程吃完后主线程开始");
            }
        }
    }
}

class T3 extends Thread {
    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("自线程" + i+"吃包子");
        }
    }
}