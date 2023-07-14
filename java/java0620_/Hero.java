package java0620_;

import java0621_.Shot;

public class Hero extends Tank {
  public Shot shot = null;

  public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank() {
        //创建shot对象 根据hero对象来创建对象
        switch (getDirect()) {//得到hero的方向 来决定发射方向
            case 0://向上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1://向右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2://向下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3://向左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        new Thread(shot).start();

    }
}
