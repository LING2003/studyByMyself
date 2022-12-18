package study.byMyself;

import java.util.Scanner;

public class 金额转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入收据金额");
            money = sc.nextInt();
            if (money>=0&&money<=9999999){
            break;

            }else System.out.println("收据金额有误，请重新输入！");
        }
        //得到money里面的数字
        String strMoney="";
        String result="";
        for (int i = 0; i <7; i++) {
            int ge = money%10;
            money=money/10;
            //strMoney=numberToCapital(ge)+strMoney; //反向拼接就不用字符串反转了，妙不可言
            strMoney=numberToCapital(ge);
            //System.out.println(strMoney);
            result=result+strMoney;
        } //System.out.println(strMoney);
        System.out.print(reverseString(result));//反转字符串+按照条件输出单位，可以用反向拼接的方法（见上），不用反转字符串。



    }
    public static String reverseString(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {

            if (i==6) {
                result = result + str.charAt(i)+"佰";
            }  else if (i==5) {
                result = result + str.charAt(i)+"拾";
            }  else if (i==4) {
                result = result + str.charAt(i)+"万";
            }  else if (i==3) {
                result = result + str.charAt(i)+"仟";
            }  else if (i==2) {
                result = result + str.charAt(i)+"佰";
            }  else if (i==1) {
                result = result + str.charAt(i)+"拾";
            } else if (i==0) {
                result = result + str.charAt(i)+"元";
            }
        }
        return result;
    }
    public static  String numberToCapital(int number){
        String[] Capital = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return Capital[number];
    }
}
