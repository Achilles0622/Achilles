package java0620_;

import java0621_.MyPanel;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private MyPanel mp = null;

    public static void main(String[] args) {
        //演示画圆
        new DrawCircle();
        System.out.println("程序退出了 ");
    }

    public DrawCircle() {//构造器
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //当点击窗口叉叉的时候 程序就退出了
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示

    }
}

class MyPanel1 extends JPanel {
    @Override
    public void paint(Graphics g) {//绘图的方法
        super.paint(g);
        System.out.println("------");
        g.drawOval(10, 200, 150, 15);
        //演示画出不同的图片
        g.drawLine(10,10,100,100);
        g.drawRect(10,10,100,100);
        g.setColor(Color.blue);
        g.fillRect(10,10,100,100);
        g.setColor(Color.red);
        g.fillOval(10,10,100,100);
    }
}