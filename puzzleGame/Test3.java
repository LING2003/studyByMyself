package study.byMyself.puzzleGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试动作事件");
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
        //addActionListener：表示我要给组件添加哪个事件监听（动作监听包含鼠标左键，空格）
        //参数：表示事件被触发之后要执行的代码
        jb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我不要点我不要点我哦");
            }
        });

        //把按钮添加到界面当中
        jFrame.getContentPane().add(jb);

        jFrame.setVisible(true);
    }
}
