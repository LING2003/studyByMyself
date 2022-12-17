package study.byMyself;

import java.util.Scanner;

public class 回文数 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int x = scanner.nextInt();
        int temp = x;
        int num=0;


        while (x != 0) {
        int ge = x%10;
        x=x/10;
        num=num*10+ge;
        }
        System.out.println("生成的数是"+num);
        System.out.println("正在与原数比较...");
        if (num==temp){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
