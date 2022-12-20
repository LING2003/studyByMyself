package study.byMyself.学生管理系统;
/*
总结：
一个循环干一件事
for循环里不要嵌套两个if
使用方法的时候看清楚方法名啊
得不偿失啊，一晌，只是因为一个方法名写错了
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSystemLoginPortUpgraded {
    public static void main(String[] args) {
        //学生管理系统升级版
        /*
        需求：
        为学生管理系统书写一个登录、注册、忘记密码的功能。
        只有用户登陆成功之后，才能进入学生管理系统中进行增删改查
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();
        loop:while (true) {
            System.out.println("------------欢迎来到未来大学学生管理系统------------");
            System.out.println("请选择操作：1.登录，2.注册，3.忘记密码");
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("登录");
                    login(userList);
                    break;
                }
                case 2: {
                    System.out.println("注册");
                    register(userList);
                    break;
                }
                case 3: {
                    System.out.println("忘记密码");
                    forgotPassword(userList);
                    break;
                }
                case 4:
                    System.out.println("退出");
                    break loop;

            }
        }
    }

    public static boolean checkUsername(String username) {
        //用户名长度必须在3~15位
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //到这里表示用户名长度是符合要求的
        //继续校验字母+数字
        //循环得到username里面的每一个字符，如果有一个字符不是字母或者数字，那么就return false;

        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        int count = 0;
        //一个循环干一件事！！！切记
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            //判断username是否为纯数字;
            if (c >= '0' && c <= '9') {
                count++;
                break;
            }
            }
        return count==0;
    }
//验证密码
public static boolean verifyPassword(ArrayList<User> list,String username,String password){
    for (int i = 0; i < list.size(); i++) {
       User compareUser = list.get(i);//对象compareUser
       if (username.equals(compareUser.getUsername())){
           //判断输入的密码和库中的密码是否一致
           if (password.equals(compareUser.getPassword()))
               return true;
       }
    }
    return false;
}    
//判断用户名是否唯一
public static boolean usernameContains(ArrayList<User> list,String username){
    for (int i = 0; i < list.size(); i++) {
       User user = list.get(i);
       String uName = user.getUsername();
       if (uName.equals(username))
           return true;
    }
    return false;
}
//验证密码
    public static boolean checkPassword(String str1,String str2){
        if (str1.equals(str2)) {
            return true;
        }else return false;

    }
//验证身份证号
    public static boolean checkIdNumber(String idNumber){
        if (idNumber.length()!=18){
            return false;
        }
        if (idNumber.charAt(0) == '0') {
                return false;
        }
        //到这里说明长度是18，首位不是0
        //下面要验证前十七位是否为数字
        for (int i = 0; i < idNumber.length()-1; i++) {
            char c = idNumber.charAt(i);
            if (!(c>='0'&&c<='9')){
                return false;
            }
        }
        //验证第18位是不是0~9或X/x
        char last = idNumber.charAt(17);
        if(!((last>='0'&&last<='9')||(last=='X')||(last=='x'))){
            return false;
        }
        return true;
    }
//验证手机号
    public static boolean checkPhoneNumber(String phoneNumber){
        if (phoneNumber.length()!=11){
            return false;
        }
        if (phoneNumber.startsWith("0")){
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c>='0'&&c<='9')){
                return false;
            }
        }
        return true;
    }

//获取验证码
    public static String Captcha(){
        Random r =new Random();
        char[] c = new char[52];
        for (int i = 0; i < c.length; i++) {
            if (i<=26){
                c[i]=(char)(97+i);
            } else {
                c[i]=(char)(65+i-26);
            }
        }
        //随机生成0~9
       int num = r.nextInt(10);
        StringBuilder sb = new StringBuilder();
        //随机生成四个字母
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(c.length);
            sb.append(c[randomIndex]);
        }
        String str = sb.append(num).toString();

        //参考验证码进阶版
        //字符串乱序
        StringBuilder sbResult = new StringBuilder();
        char[] c1 = str.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            int randomIndex = r.nextInt(c1.length);
            char temp;
            temp = c[i];
            c[i] = c[randomIndex];
            c[randomIndex] = temp;
        }
        String result = sbResult.append(c1).toString();

            return result;
        }

//判断验证码是否正确的方法
public static boolean checkCaptcha(String captcha,String inCaptcha){
        if (captcha.toLowerCase().equals(inCaptcha.toLowerCase())){
            return true;
        }
        return false;
}
//判断身份证号是否与库中相匹配
    public static boolean inspectIdNumber(ArrayList<User> list,String username,String idNumber){
        //对象compareUser
        for (int i = 0; i < list.size(); i++) {
            User compareUser = list.get(i);
            if (compareUser.getUsername().equals(username)){
                if (compareUser.getIdNumber().equals(idNumber)){
                    return true;
                }
            }
        }
        return false;
    }
//设置密码
    public static ArrayList setPassword(ArrayList<User> list,String username,String password){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)){
                list.get(i).setPassword(password);
            }
        }
       return list;
    }
//注册方法
    public static ArrayList<User> register(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        String username = "";
        String password = "";
        String idNumber = "";
        String phoneNumber = "";
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            //判断用户名是否符合规范
            if (!checkUsername(username)){
                System.out.println("您的用户名输入有误");
            }
            else if (usernameContains(list,username)){
                //已存在该用户名
                System.out.println("该用户名已存在");
            }else {
                System.out.println("😊用户名可用√");
                break;
            }
        }

        while (true) {
            System.out.println("请输入密码");
            String password1 = sc.next();
            System.out.println("请确认密码");
            String password2 = sc.next();
            if (checkPassword(password1,password2)){
                //两次密码一致，继续进行
                System.out.println("密码校验成功");
                password = password1;
                break;
            }else System.out.println("密码输入有误");
        }
        while (true) {
            System.out.println("请输入您的身份证号码");
            idNumber = sc.next();
            if (checkIdNumber(idNumber)){
                System.out.println("身份证号码核验完毕");
                break;
            }
        }
        while (true) {
            System.out.println("请输入手机号");
            phoneNumber = sc.next();
            if (checkPhoneNumber(phoneNumber)){
                System.out.println("手机号码验证通过");
                break;
            }else {
                System.out.println("手机号码格式有误，请重新输入");
                continue;
            }
        }
        //走到这里说明用户名、密码、身份证号码、手机号均通过验证
        //创建用户对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setIdNumber(idNumber);
        user.setPhoneNumber(phoneNumber);
        //给集合添加元素
        list.add(user);
        //打印，测试
        //System.out.println("用户名"+list.get(0).getUsername());
        return list;
    }
//登录方法
    public static ArrayList<User> login (ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        while (true) {
            //键盘录入用户名
            System.out.println("请输入您的用户名");
            username = sc.next();
            //用户名存在则继续进行,跳出循环
            if (usernameContains(list,username)){
                break;
            }else {
                System.out.println("用户未注册。");
            }
        }

            //键盘录入密码
            System.out.println("请输入您的密码");
            password = sc.next();


        while (true) {
            //获取一个验证码
            String captcha = Captcha();
            //键盘录入验证码
            System.out.println("请输入验证码");
            System.out.println(captcha);
            String inCaptcha = sc.next();
            if (checkCaptcha(captcha,inCaptcha)){
                System.out.println("验证码核验成功");
                break;
            }else {
                System.out.println("验证码有误");
            }
        }

        for (int i = 0; i < 3; i++) {
            if (verifyPassword(list,username,password)){
                System.out.println("登录成功");
                 StudentDemo stu = new StudentDemo();
                stu.startStudentDemo();
                break;
            }else {
                System.out.println("用户名或密码有误");
                System.out.println("请重新输入密码");
                password = sc.next();
            }

        }



        return list;
    }

//忘记密码方法
    public static ArrayList<User> forgotPassword(ArrayList<User> list){
        //键盘录入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        if (!usernameContains(list,username)){
            System.out.println("当前用户未注册");
        }else {
            //到这一步说明已经验证完了上一步,继续验证身份证号码和手机号
            System.out.println("请输入您的身份证号码");
            String idNumber = sc.next();
            if (inspectIdNumber(list,username,idNumber)){
                System.out.println("请输入密码");
                String password = sc.next();
                setPassword(list,username,password);
                System.out.println("密码修改成功");
            } else {
                System.out.println("账号信息不匹配，修改失败");
            }
        }
        return list;
    }
    }
