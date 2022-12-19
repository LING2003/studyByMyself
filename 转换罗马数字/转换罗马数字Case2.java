package study.byMyself.转换罗马数字;

import java.util.Scanner;

public class 转换罗马数字Case2 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.println("请输入一个字符串：");
            str = sc.next();
            boolean flag = checkString(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入有误，请重新输入。");
            }
        }
        //将内容变成罗马数字
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = toRoman(c);
            sb.append(s);
        }
        System.out.println(sb);
    }

    public static String toRoman(char c) {
        return switch (c) {
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "";
        };
            //注意：case后面传参一定要是字符，不能是数字，一定要带''，否则输出的全为空！！！
            //switch这样的用法只有jdk14之后才适用
            //14版本之前的用法应该是
            /*
            switch (c) {
            case '1' -> str="Ⅰ";
            case '2' -> str="Ⅱ";
            case '3' -> str="Ⅲ";
            case '4' -> str="Ⅳ";
            case '5' -> str="Ⅴ";
            case '6' -> str="Ⅵ";
            case '7' -> str="Ⅶ";
            case '8' -> str="Ⅷ";
            case '9' -> str="Ⅸ";
            default -> str="";
            }
            “}”后边不加分号，14版本要加分号。
             */

    }

    public static boolean checkString(String str) {
        if (str.length() > 9)
            return false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9')
                return false;
        }
        return true;
    }
}
