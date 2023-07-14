package java0621_;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    MyPanel mp=null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove(){
        mp =new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //窗口JFrame可以监听键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }


class MyPanel extends JPanel implements KeyListener {
    //为了让小球移动左上角坐标为变量
    int x=10;
    int y =10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //键盘接听有字符输入,该方法就会触发

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char)e.getKeyCode()+"被按了");
//根据用户不同按键处理小球的移动，上下左右来控制
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=5;
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            y-=5;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x-=5;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x+=5;
        }

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}}