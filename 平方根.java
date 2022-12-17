package study.byMyself;

import java.util.Scanner;

public class 平方根 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i*i==num){
                System.out.println(i+"就是"+num+"的平方根");
                break;
            } else if (i*i>num) {
                System.out.println((i-1)+"就是"+num+"平方根的整数部分");
                break;
            }
        }
    }
}
