package java0621_;

public class Shot implements Runnable {

    // public boolean isLife;
    int x;
    int y;
    int direct = 0;//子弹方向
    int speed = 20;//子弹速度

    boolean isLive = true;

    public Shot(int x, int y, int direct) {//构造器射击
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {//射击行为
        while (true) {
            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direct) {
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }
            System.out.println("子弹 x=" + x + "y=" + y);
            //子弹到边界和撞击到敌人会消失

            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750&&isLive)) {
                System.out.println("子弹开始消失");
                isLive = false;
                break;
            }
        }
    }
}
