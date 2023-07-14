package java0621_;

public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        //dog.start();这里不能用start
//        Thread thread = new Thread(dog);//这里底层使用了设计模式 ，代理模式
//        thread.start();
        Tiger tiger = new Tiger();//实现了runnable接口
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}
class Animal{}
class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎叫...");
    }
}
class ThreadProxy implements Runnable {
    private Runnable target = null;//属性

    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }//把这个当作Thread类

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();
    }

    public void start0() {
        run();
    }
}

class Dog implements Runnable {
    int count = 0;

    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫.....hi" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10) {
                break;
            }

        }
    }
}