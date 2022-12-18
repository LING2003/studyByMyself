package study.byMyself;

import java.util.Scanner;

public class 统计字符次数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int bigCount=0,smallCount=0,numberCount=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                smallCount++;
            } else if (str.charAt(i)>='A'&&str.charAt(i)<='Z') {
                bigCount++;
            } else if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
                numberCount++;
            }
        }
        System.out.println("大写字母个数："+bigCount);
        System.out.println("小写字母个数："+smallCount);
        System.out.println("数字个数："+numberCount);
    }
}
