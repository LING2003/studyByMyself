package study.byMyself.RuntimeAPI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class MyJframe extends JFrame implements ActionListener {
    JButton yesBut = new JButton("帅爆了");
    JButton midBut = new JButton("一般般吧");
    JButton noBut = new JButton("不帅，有点磕碜");

    JButton dadBut = new JButton("饶了我吧！");
    boolean flag = false;
    public MyJframe(){
        initJFrame();
        initView();
        this.setVisible(true);
    }

    private void initView() {
        this.getContentPane().removeAll();
        if (flag){
            //展示按钮

            dadBut.setBounds(200,20,100,30);
            this.getContentPane().add(dadBut);
            dadBut.addActionListener(this);
        }
        //创建一个JLabel的对象
        JLabel text = new JLabel("你觉得自己帅吗");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);

        //设置按钮位置
        yesBut.setBounds(200,250,100,30);
        midBut.setBounds(200,320,100,30);
        noBut.setBounds(160,390,180,30);

        //给按钮绑定动作事件
        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);

        //将三个按钮加载到界面当中
        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);

        this.getContentPane().repaint();
    }

    private void initJFrame() {
        //设置标题
        this.setTitle("恶搞好基友");
        //设置宽高
        this.setSize(500,600);
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消内部默认布局
        this.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj==yesBut){
            System.out.println("点击了帅爆了");
            showJDialog("你太自信了，给你一点小惩罚");
            flag=true;
            initView();
            try {
                Runtime.getRuntime().exec("shutdown -s -t 30");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (obj==midBut) {
            System.out.println("点击了一般般");
            showJDialog("你还是太自信了，还要给你一点小惩罚");
            flag=true;
            initView();
            try {
                Runtime.getRuntime().exec("shutdown -s -t 90");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (obj==noBut) {
            System.out.println("他认为自己长得磕碜");
            showJDialog("你还是有自知之明的，不过我还要给你一点小惩罚");
            flag=true;
            initView();
            try {
                Runtime.getRuntime().exec("shutdown -s -t 300");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }else if (obj==dadBut){
            showJDialog("放过你了");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    public void showJDialog(String content){
        //创建一个弹窗对象
        JDialog jDialog = new JDialog();
        //给弹窗设置大小
        jDialog.setSize(200,150);
        //让弹窗置顶
        jDialog.setAlwaysOnTop(true);
        //让弹窗居中
        jDialog.setLocationRelativeTo(null);
        //弹窗不关闭，无法操作下面的界面
        jDialog.setModal(true);
    }
}
