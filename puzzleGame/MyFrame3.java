package study.byMyself.puzzleGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//没有main方法，需要用外界类调用--Test5
public class MyFrame3 extends JFrame implements KeyListener {
    JButton jButton = new JButton("请英文状态下键盘录入");
    public MyFrame3() throws HeadlessException {
        JFrame jFrame = new JFrame("测试键盘事件");
        //设置界面宽高
        jFrame.setSize(600,600);
        //设置界面指定
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(null);


        //设置位置和宽高
        jButton.setBounds(100,0,400,50);
        //给按钮添加动作监听
        //jb：组件对象，表示你要给哪个组件添加事件
        //addKeyListener：表示我要给组件添加哪个事件监听（键盘监听能用的监听包括按键、松按键）
        //参数：表示事件被触发之后要执行的代码
        jButton.addKeyListener(this);

        //把按钮添加到界面当中
        jFrame.getContentPane().add(jButton);

        jFrame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65){
            System.out.println("现在按的是A");
        } else if (code == 66) {
            System.out.println("现在按的是B");
        }else {
            System.out.println("现在按下的键盘案件编号是"+code);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

