package study.byMyself.jdk8DateDemo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class testDemo1 {
    /*
    键盘录入
    键盘录入一些1~100之间的整数，并添加到集合中
    直到集合所有数据和超过200为之。
     */
    public static void main(String[] args) {
    //创建一个集合
        ArrayList<Integer> list= new ArrayList<>();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入1~100之间的整数");
            String str1 = sc.nextLine();
            Integer i1 = Integer.parseInt(str1);
            if (i1<1||i1>100){
                System.out.println("输入有误，请重新输入");
                continue;
            }
            list.add(i1);
            int sum = getSum(list);
            if (sum>200){
                break;
            }
        }
        System.out.println(getSum(list));
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum+list.get(i);
        }
        return sum;
    }
}
