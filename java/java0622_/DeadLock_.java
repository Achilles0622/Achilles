package java0622_;

public class DeadLock_ {
    public static void main(String[] args) {
        DeadLockDemo A= new DeadLockDemo(true);
        DeadLockDemo B = new DeadLockDemo(false);;
        A.start();
        B.start();
    }
}
//线程
class DeadLockDemo extends Thread{
    static Object o1=new Object();
    static Object o2=new Object();
    boolean flag;
    public DeadLockDemo(boolean flag){//构造器
        this.flag=flag;
    }
    public void run(){
        if(flag) {
            synchronized (o1) {//对象互斥锁
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        }else{
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"进入4");
                }
            }
        }
    }
}
