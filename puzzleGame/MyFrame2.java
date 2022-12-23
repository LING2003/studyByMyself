package study.byMyself.puzzleGame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试鼠标事件");
        //设置界面宽高
        jFrame.setSize(600,600);
        //设置界面指定
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(null);

        //创建一个按钮对象
        JButton jb = new JButton("点我啊");
        //设置位置和宽高
        jb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jb：组件对象，表示你要给哪个组件添加事件
        //addMouseListener：表示我要给组件添加哪个事件监听（鼠标监听包含鼠标划入、按下不松、松开、单击、划出，空格）
        //参数：表示事件被触发之后要执行的代码
        jb.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标单击");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按住不松");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标松开");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("鼠标划入");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标划出");
            }
        });

        //把按钮添加到界面当中
        jFrame.getContentPane().add(jb);

        jFrame.setVisible(true);
    }
    }

