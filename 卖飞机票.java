package study.byMyself;

import java.util.Scanner;

public class 卖飞机票 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int ticket=sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入是否为头等舱，是为1，不是为2");
        int seat=sc.nextInt();
        if (seat!=1&&seat!=2)
            System.out.println("输入的舱位数据非法。");
        if (month>=5&&month<=10){
         ticket =  getPrice(ticket,seat,0.9,0.85);
        }
        else if (month>=1&&month<=4||month>=11&&month<=12){
         ticket = getPrice(ticket,seat,0.7,0.65);
        }
        System.out.println("票价："+ticket);

    }

    public static int getPrice(int ticket,int seat,double v1,double v2) {
        if (seat==1)
            ticket=(int)(ticket*v1);
        else if (seat==2)
            ticket=(int)(ticket*v2);
        return ticket;
    }
}
