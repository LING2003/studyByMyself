package study.byMyself;

import java.util.Scanner;

public class 金额转换优化版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if (money>=0&&money<=9999999){
                break;
            }else {
                System.out.println("输入有误，请重新输入。");
            }
        }
        String strMoney="";
        for (int i = 0; i < 7; i++) {
            int ge=money%10;
            money=money/10;
            strMoney=numberToArr(ge)+strMoney;
        }
        String result = addUnit(strMoney);
        System.out.println(result);

    }

    public  static  String addUnit(String str){
        String result="";
        String[] unit = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < str.length(); i++) {
            result=result+ str.charAt(i)+unit[i];
        }
        return result;
    }

    public static  String numberToArr(int number){
        String[] str={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return str[number];
    }
}
