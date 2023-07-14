package java0621_;

import java0620_.Hero;
import java0622_.Bomb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了监听键盘事件实现
//为了让Panel不停重绘子弹 需要MyPanel实现Runnable当作一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    Hero hero = null;//定义我方坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();//敌人集合坦克
    //定义1哥Vector，用于存放我们的炸弹 ，子弹击中时候加入一个bomb对象到bombs
    Vector<Bomb>bombs=new Vector<>();
    int enemyTankSize = 3;
    //定义三张照片
      Image image1=null;
    Image image2=null;
    Image image3=null;


    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(10); //黄色坦克的移动速度
        //初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (1 + i)), 0);
            enemyTank.setDirect(2);
            //启动敌人坦克的线程，让其动起来
            new Thread(enemyTank).start();
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            //加入Vector成员
            enemyTank.shots.add(shot);
            new Thread(shot).start();

            enemyTanks.add(enemyTank);
        }
//初始化图片三张
     //   image1=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/"))
        //   image2=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/"))
        //   image3=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/"))

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        //黄色坦克封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        //画出hero的子弹
        if (hero.shot != null && hero.shot.isLive == true) {
            System.out.println("子弹被绘制");
            // g.fill3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
        }
        //如果bombs集合中有对象就画出
        //for (int i = 0; i <bombs ; i++) {  没有放照片
            //Bomb bomb=bombs.get(i);

        //蓝色坦克 遍历Vector
        for(int i = 0; enemyTanks.size() > i; i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断坦克是否存活
            if(enemyTank.isLive){//当敌人坦克存活着才画出该坦克
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
            //蓝色坦克的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                //绘制子弹，判断子弹是否存活
                if (shot.isLive) {
                    g.draw3DRect(shot.x, shot.y, 1, 1, false);
                } else {
                    //从Vector移处
                    enemyTank.shots.remove(shot);
                }
            }
        }}
    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        switch (direct) {
            case 0://下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://shang
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://zuo
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时没有处理 ");
        }
    }

    //编写方法，我放子弹是否打中坦克
    public  void hitTank(Shot s, EnemyTank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0://坦克向上
            case 2://坦克向下
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40 &&
                        s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //当我方子弹击中坦克 敌人坦克去掉
                    enemyTanks.remove(enemyTank);
                    //创建Bomb对象，加入到bombs里面
                    new Bomb(enemyTank.getX(),enemyTank.getY());
                //    bombs.add(bomb);
                }
                break;
            case 1://坦克向左
            case 3://坦克向右
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60 &&
                        s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //创建Bomb对象，加入到bombs里面
                    new Bomb(enemyTank.getX(),enemyTank.getY());
                    //    bombs.add(bomb);
                }
                break;
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {//处理键wads按下情况
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveRight();
        }
        //如果按j就发射子弹
        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下J开始发射子弹");
            hero.shotEnemyTank();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void run() {//每隔100ms重绘区域,不停刷新绘图的区域 ，就能看到子弹开始移动
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //判断坦克击中
            if(hero.shot!=null&& hero.shot.isLive){//当前子弹还存活
                //遍历敌人所有坦克
                for (int i = 0; i <enemyTanks.size() ; i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot,enemyTank);

                }
            }
            this.repaint();
        }
    }
}
