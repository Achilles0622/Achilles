package java0622_;

public class Bomb {
    int x, y;//炸弹的坐标
    int life = 9;//是否存在,生命周期
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //生命减少
    public void lifeDown() {
        if (life > 0) {
            life--;

        } else {
            isLive = false;
        }
    }
}
