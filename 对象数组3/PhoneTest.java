package study.byMyself.对象数组3;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //1.定义数组存储3部手机对象
        Phone[] phones = new Phone[3];
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < phones.length; i++) {
            Phone p = new Phone();
            System.out.println("请输入手机的品牌");
            String brand = sc.next();
            p.setBrand(brand);
            System.out.println("请输入手机的价格");
            double price = sc.nextDouble();
            p.setPrice(price);
            System.out.println("请输入手机的颜色");
            String color = sc.next();
            p.setColor(color);
            phones[i]=p;

        }
        double avg = avgPrice(phones[0].getPrice(),phones[1].getPrice(),phones[2].getPrice());
        System.out.println(avg);

    }
    public static double avgPrice(double p1,double p2,double p3){
        double avg = (p1+p2+p3)/3;
        return avg;
    }
}
