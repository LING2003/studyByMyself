package study.byMyself;

import java.util.Scanner;

public class 用户登录 {
    public static void main(String[] args) {
        //1.定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        //键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //比较
            if (username.equals(rightUsername)&&password.equals(rightPassword)){
                System.out.println("登录成功，欢迎来到幻影之城。");
                break;
            }
            else {
                if (i==2){
                    System.out.println("您的账号已被锁定，请联系管理员解锁。");
                }
                else {
                    System.out.println("您的用户名或密码有误，您还剩下"+(2-i)+"次机会");
                }
            }
        }
    }
}
