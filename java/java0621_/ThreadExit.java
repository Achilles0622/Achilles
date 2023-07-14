package java0621_;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();//如果希望主线程控制t1的终止，需要修改loop控制变量
        //让t1退出run方法 从而终止,休眠10s
        System.out.println("休眠10s主线程");
        Thread.sleep(10*1000);

        t1.setLoop(false);
    }
}
class T extends Thread{
    int count=0;
    //设置一个控制变量
    private boolean loop=true;

    public void  run(){
        while(loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T运行中"+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
