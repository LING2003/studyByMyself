package study.byMyself;

import java.util.Scanner;

public class 遍历字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
            System.out.println(c);
        }

    }
}
