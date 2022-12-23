package study.byMyself.puzzleGame.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //创建一个二维数组
    //目的：用来管理数据
    //加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;


    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义一个计数器，用来统计步数
    int step = 0;

    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("联系我");

    JMenuItem AnimalItem = new JMenuItem("动物");
    JMenuItem BeautyItem = new JMenuItem("美女");
    JMenuItem SportItem = new JMenuItem("运动");

    Random r = new Random();
    int index = r.nextInt(8) + 1;
    String randomPath = "..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\animal\\animal" + index;

    //1.创建一个游戏的主界面
    public GameJFrame() throws HeadlessException {
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();

        //初始化数据(打乱)
        initData();

        //初始化图片
        initImage();

        //让界面显示出来，最好写在最后
        setVisible(true);
    }

    private void initData() {
        //需求：打乱一维数组中的数据
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        //打乱数组数据
        //遍历数组得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        for (int i = 0; i < tempArr.length; i++) {
            //获得随机索引
            int randomIndex = r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = temp;
        }

        //给二维数组添加数据
        //解法一：
        //遍历一维数组tempArr得到每一个元素，把每一个元素依次添加到二维数组当中

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                y = i / 4;
                x = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片

    private void initImage() {
        //先清空已经加载完的图片
        //后面加载的图片在底层会被覆盖
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利图标
            JLabel win = new JLabel(new ImageIcon("C:\\Users\\liyongda\\IdeaProjects\\obj\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\win.png"));
            win.setBounds(203, 283, 197, 73);
            this.getContentPane().add(win);
        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);
        //细节：
        //先加载的图片在上方，后加载的图片塞在下方
        //外循环----把内循环重复执行了4次
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int num = data[i][j];
                //创建一个图片ImageIcon的对象
                ImageIcon icon = new ImageIcon(randomPath + "\\" + num + ".jpg");
                //创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                //BevelBorder:斜边框
                //0：表示让图片凸起来
                //1：表示让图片凹下去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //将管理容器添加到界面中
                this.getContentPane().add(jLabel);


            }

        }
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面当中
        this.getContentPane().add(background);

        //将图片刷新（重新加载）
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //初始化菜单
        //创建整个菜单对象 JMenuBar
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面两个选项的对象（功能 关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changePicture = new JMenu("更换图片");

        //创建条目对象
        //成员位置已创建

        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(changePicture);
        changePicture.add(AnimalItem);
        changePicture.add(BeautyItem);
        changePicture.add(SportItem);


        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        AnimalItem.addActionListener(this);
        BeautyItem.addActionListener(this);
        SportItem.addActionListener(this);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个页面设置菜单
        setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        setSize(603, 680);
        //setSize(420, 680);
        //设置界面的标题
        setTitle("拼图v1.0");
        //设置界面置顶
        setAlwaysOnTop(true);
        //设置界面居中
        setLocationRelativeTo(null);
        //设置关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//3->关闭其中一个界面，直接关闭虚拟机

        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，直接返回结果
        if (victory()) {
            //return: 1.返回结果 2.结束方法
            return;
        }
        int code = e.getKeyCode();
        System.out.println(code);
        if (code == 192) {
            //192->'~\`'
            //清空所有图片
            this.getContentPane().removeAll();
            //创建图片ImageIcon
            //"..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\animal\\animal"+index
            ImageIcon icon = new ImageIcon(randomPath + "\\all.jpg");

            //创建图片容器
            JLabel jLabel = new JLabel(icon);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\background.png"));
            //指定图片位置
            jLabel.setBounds(83, 134, 420, 420);
            background.setBounds(40, 40, 508, 560);
            //添加图片
            this.getContentPane().add(jLabel);
            this.getContentPane().add(background);


            //重新加载图片
            this.getContentPane().repaint();


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，直接返回结果
        if (victory()) {
            //return: 1.返回结果 2.结束方法
            return;
        }

        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if (x == 3) {
                return;
            }
            data[y][x] = data[y][x + 1];
            data[y][x + 1] = 0;
            x++;
            //x自增重新记录0坐标位置
            step++;
            //步数自增

            initImage();
            //按照最新的位置加载图片
        } else if (code == 38) {
            System.out.println("向上移动");
            if (y == 3) {
                return;
            }
            data[y][x] = data[y + 1][x];
            data[y + 1][x] = 0;
            y++;
            //y自增重新记录0坐标位置
            step++;
            //步数自增
            initImage();
            //按照最新的位置加载图片
        } else if (code == 39) {
            System.out.println("向右移动");
            if (x == 0) {
                return;
            }
            data[y][x] = data[y][x - 1];
            data[y][x - 1] = 0;
            x--;
            //x自增重新记录0坐标位置
            step++;
            //步数自增
            initImage();
            //按照最新的位置加载图片
        } else if (code == 40) {
            System.out.println("向下移动");
            if (y == 0) {
                return;
            }
            data[y][x] = data[y - 1][x];
            data[y - 1][x] = 0;
            y--;
            //y自增重新记录0坐标位置
            step++;
            //步数自增
            initImage();
            //按照最新的位置加载图片
        } else if (code == 192) {
            //松开‘~’键，重新加载图片
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            //i:依次表示二维数组data里面的索引
            //data[i]:依次表示每一个一维数组
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    //只要有一个数据不一样，返回false
                    return false;
                }
            }
        }
        //循环结束表示数组遍历比较完毕，全都一样返回true
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            System.out.println("重新游戏");
            //再次打乱二维数组中的数据
            initData();
            //让步数变成0
            step = 0;
            //重新加载图片
            initImage();

            //刷新页面
        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            //关闭游戏界面
            this.setVisible(false);
            //打开登陆界面
            new LoginJFrame();
        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机即可
            System.exit(0);

        } else if (obj == accountItem) {
            System.out.println("联系我");
            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            jDialog.setTitle("扫描二维码即可添加微信");
            ///创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\liyongda\\IdeaProjects\\obj\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\Weixin.png"));
            //设置位置和宽高
            jLabel.setBounds(0, 0, 190, 259);
            //把图片添加到弹窗当中
            jDialog.getContentPane().add(jLabel);
            //给弹窗设置大小
            jDialog.setSize(344, 344);
            //让弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //让弹窗居中
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭无法操作下面的界面
            jDialog.setModal(true);
            //让弹窗显示出来
            jDialog.setVisible(true);
        } else if (obj == AnimalItem) {
            this.getContentPane().removeAll();
           /* System.out.println("更换图片");
            //创建图片ImageIcon对象
            ImageIcon icon = new ImageIcon();
            //创建管理容器
            JLabel jLabel = new JLabel(icon);
            //设置图片位置信息
            jLabel.setBounds();
            //将管理容器添加到界面中
            this.getContentPane().add(jLabel);

            */
            //细节：
            //先加载的图片在上方，后加载的图片塞在下方
            //外循环----把内循环重复执行了4次

            Random r = new Random();
            int index = r.nextInt(8) + 1;
            randomPath = "..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\animal\\animal" + index;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    //获取当前要加载图片的序号
                    int num = data[i][j];
                    //创建一个图片ImageIcon的对象

                    ImageIcon icon = new ImageIcon(randomPath + "\\" + num + ".jpg");
                    //创建一个JLabel的对象(管理容器)
                    JLabel jLabel = new JLabel(icon);
                    //指定图片位置
                    jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                    //给图片添加边框
                    //BevelBorder:斜边框
                    //0：表示让图片凸起来
                    //1：表示让图片凹下去
                    jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    //将管理容器添加到界面中
                    this.getContentPane().add(jLabel);


                }

            }
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面当中
            this.getContentPane().add(background);

            //将图片刷新（重新加载）
            this.getContentPane().repaint();

        }else if (obj == BeautyItem) {
            this.getContentPane().removeAll();
           /* System.out.println("更换图片");
            //创建图片ImageIcon对象
            ImageIcon icon = new ImageIcon();
            //创建管理容器
            JLabel jLabel = new JLabel(icon);
            //设置图片位置信息
            jLabel.setBounds();
            //将管理容器添加到界面中
            this.getContentPane().add(jLabel);

            */
            //细节：
            //先加载的图片在上方，后加载的图片塞在下方
            //外循环----把内循环重复执行了4次

            Random r = new Random();
            int index = r.nextInt(13) + 1;
            randomPath = "..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\girl\\girl" + index;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    //获取当前要加载图片的序号
                    int num = data[i][j];
                    //创建一个图片ImageIcon的对象

                    ImageIcon icon = new ImageIcon(randomPath + "\\" + num + ".jpg");
                    //创建一个JLabel的对象(管理容器)
                    JLabel jLabel = new JLabel(icon);
                    //指定图片位置
                    jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                    //给图片添加边框
                    //BevelBorder:斜边框
                    //0：表示让图片凸起来
                    //1：表示让图片凹下去
                    jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    //将管理容器添加到界面中
                    this.getContentPane().add(jLabel);


                }

            }
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面当中
            this.getContentPane().add(background);

            //将图片刷新（重新加载）
            this.getContentPane().repaint();

        }else if (obj == SportItem) {
            this.getContentPane().removeAll();
           /* System.out.println("更换图片");
            //创建图片ImageIcon对象
            ImageIcon icon = new ImageIcon();
            //创建管理容器
            JLabel jLabel = new JLabel(icon);
            //设置图片位置信息
            jLabel.setBounds();
            //将管理容器添加到界面中
            this.getContentPane().add(jLabel);

            */
            //细节：
            //先加载的图片在上方，后加载的图片塞在下方
            //外循环----把内循环重复执行了4次

            Random r = new Random();
            int index = r.nextInt(10) + 1;
            randomPath = "..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\sport\\sport" + index;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    //获取当前要加载图片的序号
                    int num = data[i][j];
                    //创建一个图片ImageIcon的对象

                    ImageIcon icon = new ImageIcon(randomPath + "\\" + num + ".jpg");
                    //创建一个JLabel的对象(管理容器)
                    JLabel jLabel = new JLabel(icon);
                    //指定图片位置
                    jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                    //给图片添加边框
                    //BevelBorder:斜边框
                    //0：表示让图片凸起来
                    //1：表示让图片凹下去
                    jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    //将管理容器添加到界面中
                    this.getContentPane().add(jLabel);


                }

            }
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("..\\lyd\\src\\study\\byMyself\\puzzleGame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面当中
            this.getContentPane().add(background);

            //将图片刷新（重新加载）
            this.getContentPane().repaint();

        }

    }
}
