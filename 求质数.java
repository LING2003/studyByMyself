package study.byMyself;

import java.util.Scanner;

public class 求质数 {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                flag=false;
                break;
            }

        }
        if (flag){
            System.out.println(num+"是一个质数");
        }
        else System.out.println(num+"不是质数");
    }
}
