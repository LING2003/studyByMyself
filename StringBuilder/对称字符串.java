package study.byMyself.StringBuilder;

import java.util.Scanner;

public class 对称字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串，系统会判断它是否属于对称字符串。");
        String string = sc.next();
        String reverseString = new StringBuilder().append(string).reverse().toString();

        if (reverseString.equals(string)) {
            System.out.println("该字符串是对称字符串。");
        } else System.out.println("该字符串不是对称字符串。");

    }
}
