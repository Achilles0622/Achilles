package java0621_;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        //希望主线程结束时 子线程自动结束
        for (int i = 1; i <= 10; i++) {
            System.out.println("宝强再辛苦工作");
            Thread.sleep(100);

        }
    }
}

class MyDaemonThread extends Thread {
    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马融和宋快乐的聊天");

        }
    }
}

