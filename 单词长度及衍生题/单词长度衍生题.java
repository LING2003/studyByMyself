package study.byMyself.单词长度及衍生题;

import java.util.Scanner;

public class 单词长度衍生题 {
    public static void main(String[] args) {
        /*
        给你一个字符串s,由若干单词组成，单词前后用一些空格字符隔开。
        返回字符串中最后一个单词
        单词是指仅有字母组成、不包含任何空格字符的最大子字符串
        如：输入s="Hello world" 输出world
            输入s="fly me to moon" moon
            ......
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个英文句子，句子中的最后一个单词不能包含数字！");
        String str = sc.nextLine();
        //不过多赘述，依旧注意 空格和next()不能连用，nextLine()不受空格影响。
        String result = determineWord(str);
        System.out.println(result);
    }

    public static String determineWord(String str) {
        char[] c = str.toCharArray();
        String result = "";
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] >= 65 && c[i] <= 90 || c[i] >= 97 && c[i] <= 122) {
                result = c[i] + result;
                //倒序遍历，倒序拼接
            } else if (c[i] != ' ') {
                System.out.println("输入中含有除字母和空格外的其它字符,无法继续遍历，请重新输入。");
                break;
            }else break;
        }
        return result;
    }


}


