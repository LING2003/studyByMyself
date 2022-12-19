package study.byMyself.调整字符串;

import java.util.Random;
import java.util.Scanner;

public class 字符串乱序 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String newStr = outOfOrder(str);
        System.out.println(newStr);
    }

    //定义一个打乱字符串的方法
    public static String outOfOrder(String str){
        //字符数组

       char[] arr= str.toCharArray();
       char first = arr[0];
       Random r = new Random();
       for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            char temp;
            temp = arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]= temp;
            //for循环中打乱数组顺序需要参考以前代码：抽奖方式二
           //利用随机索引，temp，将arr[i]中的顺序打乱
           //原理是arr[i]->temp,arr[randomIndex]->arr[i],temp->arr[randomIndex]
        }
       String result = new String(arr);
       return result;
    }
}
