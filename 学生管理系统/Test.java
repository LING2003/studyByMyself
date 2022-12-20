package study.byMyself.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            //学生管理系统升级版
        /*
        需求：
        为学生管理系统书写一个登录、注册、忘记密码的功能。
        只有用户登陆成功之后，才能进入学生管理系统中进行增删改查
         */
            Scanner sc = new Scanner(System.in);
            ArrayList<User> userList = new ArrayList<>();
            System.out.println("------------欢迎来到未来大学学生管理系统------------");
            System.out.println("请选择操作：1.登录，2.注册，3.忘记密码");
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("登录");
                    break;
                }
                case 2: {
                    System.out.println("注册");
                    register(userList);
                    break;
                }
                case 3: {
                    System.out.println("忘记密码");
                    break;
                }
                default:
                    System.out.println("输入有误，请重新输入");

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
            System.out.println("用户名"+list.get(0).getUsername());
            return list;
        }

    }


