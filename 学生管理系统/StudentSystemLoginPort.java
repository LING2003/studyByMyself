package study.byMyself.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystemLoginPort {
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
                registered(userList);
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

    //判断用户名是否存在
    public static boolean usernameContains(ArrayList<User> userList, String name) {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getUsername().equals(name)) {
                //存在，返回true
                return true;
            }
        }
        //不存在，返回false
        return false;
    }

    //
    //注册方法
    public static ArrayList<User> registered(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("请输入你的用户名");
            String newUsername = scanner.nextLine();
            if (usernameContains(userList, newUsername)) {
                System.out.println("用户名已存在");
            } else {
                //不存在，继续判断是否满足用户名长度要求
                if (newUsername.length() < 3 || newUsername.length() > 15) {
                    System.out.println("用户名长度不符合规范");
                    System.out.println("请输入长度在3~15之间的用户名");
                } else {
                    int count = 0;
                    for (int i = 0; i < newUsername.length(); i++) {
                        char c = newUsername.charAt(i);
                        if (c >= '1' && c <= '9') {
                            count++;
                            if (count == 0) {
                                System.out.println("用户名输入不规范，用户名中只少包含一个数字");
                            } else {
                                while (true) {
                                    System.out.println("请输入您的密码");
                                    String password1 = scanner.nextLine();
                                    System.out.println("请再次输入密码");
                                    String password2 = scanner.nextLine();
                                    if (password1.equals(password2)) {
                                        System.out.println("密码符合规范");
                                        while (true) {
                                            System.out.println("请输入您的身份证号码");
                                            String idNumber = scanner.nextLine();
                                            if (idNumber.length() != 18) {
                                                System.out.println("您输入的身份证号码有误,位数应为18 ");
                                            } else {
                                                if (idNumber.charAt(0) == '0') {
                                                    System.out.println("身份证号码有误，开头不能为0");
                                                } else {
                                                    for (int i1 = 0; i1 < idNumber.length() - 1; i1++) {
                                                        char c1 = idNumber.charAt(i);
                                                        if (c1 >= '0' && c1 <= '9') {
                                                            //判断最后一位是不是在0~9、X或x之间
                                                            char c2 = idNumber.charAt(17);
                                                            if (c2 >= '0' && c2 <= '9' || c2 == 'X' || c2 == 'x') {
                                                                while (true) {
                                                                    //键盘录入手机号码
                                                                    System.out.println("请输入您的手机号码");
                                                                    String phoneNumber = scanner.next();
                                                                    //判断手机号码长度是否是11位
                                                                    if (phoneNumber.length() == 11) {
                                                                        //判断手机号码是否以‘0’开头
                                                                        if (phoneNumber.charAt(0) == '0') {
                                                                            System.out.println("您输入的手机号码有误，手机号不能以0开头");
                                                                        } else {
                                                                            for (int i2 = 0; i2 < phoneNumber.length(); i2++) {
                                                                                //判断手机号码中是否有0~9以外的字符
                                                                                char c3 = phoneNumber.charAt(i);
                                                                                if (c3 >= '0' && c3 <= '9') {
                                                                                    //创建用户对象
                                                                                    User user = new User(newUsername, password1, idNumber, phoneNumber);
                                                                                    //将用户对象添加到用户集合当中
                                                                                    userList.add(user);
                                                                                    break loop;//结束循环
                                                                                } else {
                                                                                    System.out.println("输入的手机号码有误，手机号码应由数字组成");
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        System.out.println("您输入的手机号码位数有误，请检查后再输入");
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("身份证号码最后一位有误");
                                                            }
                                                        } else {
                                                            System.out.println("身份证号码有误，前17位应为数字");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("两次密码输入不一致");//重新输入
                                    }
                                }
                            }
                            System.out.println(count);
                        } else {
                            System.out.println("用户名输入不规范，用户名应以字母和数字构成");
                        }

                    }
                }
            }
        }
        return userList;
    }
}
