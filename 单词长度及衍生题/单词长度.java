package study.byMyself.单词长度及衍生题;

import java.util.Scanner;

public class 单词长度 {
    public static void main(String[] args) {
        /*
        给你一个字符串s,由若干单词组成，单词前后用一些空格字符隔开。
        返回字符串中最后一个单词的长度
        单词是指仅有字母组成、不包含任何空格字符的最大子字符串
        如：输入s="Hello world" 输出5
            输入s="fly me to moon" 输出4
            ......
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个英文句子，句子中的最后一个单词不能包含数字！");
        String str = sc.nextLine();
        //I love you so much
        /*
        这里重点标注一下：
        划重点！！！
        键盘录入时如果用next(),遇到空格会自动停止，并将空格后的值赋值给下一个next(),
        如果用nextLine(),遇到空格不会停止，遇到回车才停止，所以在测试环节出现了以下问题：
        如果：将str直接赋值，即 String str = "I love you so much"-->>much
        如果：使用键盘录入next()方法，键盘输入"I love you so much"-->>I
        再如果：使用nextLine()方法，键盘输入"I love you so much"-->much
         */
        int count = determineWord(str);
        System.out.println("单词长度:" + count);
    }

    public static int determineWord(String str) {
        char[] c = str.toCharArray();
        int count = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] >= 65 && c[i] <= 90 || c[i] >= 97 && c[i] <= 122) {
                count++;
            } else if (c[i] != ' ') {
                System.out.println("输入中含有除字母和空格外的其它字符,无法继续遍历，请重新输入。");
                break;
            } else break;

        }
        return count;
    }
}
