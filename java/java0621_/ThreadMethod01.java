package java0621_;

public class ThreadMethod01 {
    public static void main(String[] args) {
        T t = new T();
        t.setName("老韩");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println(t.getName());
    }
}

class X extends Thread {
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "吃包子" + i);

        }
        try {
            System.out.println(Thread.currentThread().getName() + "休眠中");
            Thread.sleep(20000);//20s
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "被interrupt了");
        }
    }
}