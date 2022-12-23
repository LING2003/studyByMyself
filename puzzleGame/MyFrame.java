package study.byMyself.puzzleGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//没有main方法，需要用外界类调用--Test4
public class MyFrame extends JFrame implements ActionListener{
    //创建一个按钮对象
    JButton jb = new JButton("点我啊");
   public MyFrame() {
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


        //设置位置和宽高
        jb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jb：组件对象，表示你要给哪个组件添加事件
        //addActionListener：表示我要给组件添加哪个事件监听（动作监听包含鼠标左键，空格）
        //参数：表示事件被触发之后要执行的代码
        jb.addActionListener(this);

        //把按钮添加到界面当中
        jFrame.getContentPane().add(jb);

        jFrame.setVisible(true);
    }

    @Override
    public  void actionPerformed(ActionEvent e) {
        Random r = new Random();
        jb.setBounds(r.nextInt(500),r.nextInt(500),100,50);
        System.out.println("哎呦喂，别点啦");
    }
}
