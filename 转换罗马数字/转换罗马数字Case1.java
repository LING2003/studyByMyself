package study.byMyself.转换罗马数字;

import java.util.Scanner;

public class 转换罗马数字Case1 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            boolean flag =checkStr(str);
            if (flag){
               break;
            }else {
                System.out.println("当前输入的字符串有误，请重新输入。");
                continue;
            }
        }
        StringBuilder toRomanNumerals= new StringBuilder();
        String string="";
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i)-48;
           string = toRomanNumerals.append(stringToRomanNumerals(num)).toString();
        }
        System.out.println(string);

    }
    public static String stringToRomanNumerals(int number){
        String[] str = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return str[number];
        }


    public static boolean checkStr(String str){
        if (str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c<'0'||c>'9'){
                return false;
            }
        }
            return true;
    }
}
