package study.byMyself.puzzleGame.ui;

import javax.swing.*;
import java.awt.*;

public class RegisterFrame extends JFrame {
    public RegisterFrame() throws HeadlessException {
        //设置界面的宽高
        setSize(488,500);
        //设置界面的标题
        setTitle("拼图 注册");
        //设置界面置顶
        setAlwaysOnTop(true);
        //设置界面居中
        setLocationRelativeTo(null);
        //设置关闭模式
        setDefaultCloseOperation(3);//3->关闭其中一个界面，直接关闭虚拟机


        //让界面显示出来，最好写在最后
        setVisible(true);
    }
}
