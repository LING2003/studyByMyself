package study.byMyself.puzzleGame.ui;

import study.byMyself.puzzleGame.CodeUtil;
import study.byMyself.puzzleGame.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener  {
    //5.添加登录按钮
    JButton login = new JButton();
    //6.添加注册按钮
    JButton register = new JButton();

    //2.添加用户名输入框
    JTextField username = new JTextField();
    //4.密码输入框
    JTextField password = new JTextField();
    //验证码的输入框
    JTextField code = new JTextField();
    static ArrayList<User> list = new ArrayList<>();

    static {
        list.add(new User("lyd", "123"));
        list.add(new User("zhangsan", "123"));
    }

    //正确的验证码
    JLabel rightCode = new JLabel();

    public LoginJFrame() throws HeadlessException {
        //初始化界面
        initFrame();

        //在这个界面中添加内容
        initView();


        //让界面显示出来，最好写在最后
        setVisible(true);
    }

    private void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框

        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框

        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框

        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        String codeStr = CodeUtil.generateCode();
        //JLabel rightCode = new JLabel();
        //设置内容
        rightCode.setText(codeStr);
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //给rightCode设置动作监听
        rightCode.addMouseListener(this);
        //添加到界面
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        //JButton login = new JButton();
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        //给登录按钮绑定动作事件
        login.addMouseListener(this);
        this.getContentPane().add(login);

        //6.添加注册按钮
        //JButton register = new JButton();
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

    }


    private void initFrame() {
        //设置界面的宽高
        setSize(488, 430);
        //设置界面的标题
        setTitle("拼图 登录");
        //设置界面置顶
        setAlwaysOnTop(true);
        //设置界面居中
        setLocationRelativeTo(null);
        //设置关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//3->关闭其中一个界面，直接关闭虚拟机
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("点击了登录按钮");
            //获取两个文本框中的数据
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            //获取用户输入的验证码
            String codeInput = code.getText();

            //创建一个User对象
            User userInfo = new User(usernameInput, passwordInput);
            System.out.println("用户输入的用户名为" + usernameInput);
            System.out.println("用户输入的密码为" + passwordInput);
            if (codeInput.length() == 0) {
                System.out.println("验证码不能为空");
            } else if (usernameInput.length() == 0 || passwordInput.length() == 0) {
                System.out.println("用户名或密码为空");
                //调用弹窗showJDialog
                showJDialog("用户名或者密码为空");
            } else if (!codeInput.equalsIgnoreCase(rightCode.getText())) {
                System.out.println("验证码错误");
                showJDialog("验证码错误");
                //获取一个新的验证码
                String code = CodeUtil.generateCode();
                rightCode.setText(code);
            } else if (contains(userInfo)) {
                System.out.println("登录成功");
                this.setVisible(false);
                //打开游戏主界面
                //需要把当前登录的用户名传递给游戏界面
                new GameJFrame();
            } else {
                System.out.println("用户名或密码错误");
                showJDialog("用户名或密码错误");
                //获取一个新的验证码
                String code = CodeUtil.generateCode();
                rightCode.setText(code);
            }


        } else if (e.getSource() == register) {
            System.out.println("点击了注册按钮");

        } else if (e.getSource() == rightCode) {
            System.out.println("更换验证码");
            //获取一个新的验证码
            String code = CodeUtil.generateCode();
            rightCode.setText(code);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\登录按下.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\注册按下.png"));

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\登录按钮.png"));

        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\login\\注册按钮.png"));

        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void showJDialog(String content) {
        //创建一个弹窗对象
        JDialog jDialog = new JDialog();
        //设置弹窗大小
        jDialog.setSize(200, 150);
        //让弹窗置顶
        jDialog.setAlwaysOnTop(true);
        //让弹窗居中
        jDialog.setLocationRelativeTo(null);
        //弹窗不关闭无法操作下面界面
        jDialog.setModal(true);

        //创建JLabel对象管理文字并添加到弹窗当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹窗显示出来
        jDialog.setVisible(true);
    }

    //判断用户在集合中是否存在
    public boolean contains(User userInput) {
        for (int i = 0; i < list.size(); i++) {
            User rightUser = list.get(i);
            if (userInput.getUsername().equals(rightUser.getUsername()) && userInput.getPassword().equals(rightUser.getPassword())) {
                return true;
            }
        }
        //循环结束没有找到表示账户不存在
        return false;
    }


    }

