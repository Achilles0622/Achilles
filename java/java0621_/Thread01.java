package java0621_;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start();
        //当main线程启动一个一个子线程 Thread-0，主线程不会阻塞，会继续
        System.out.println("主线程继续执行"+Thread.currentThread().getName());
        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程i="+i);
            //主线程休眠
            Thread.sleep(1000);

        }
    }
}

class Cat extends Thread {//继承了Thread就可以当做线程来使用了
    int times = 0;

    //我们回重写run方法协商自己的业务代码
    //run Thread实现了Runnable接口run方法
    public void run() {
        while (true) {
            System.out.println("喵喵 ，我是小猫目"+(++times)+"线程名"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(times==80){
                break;
            }
        }
    }
}
