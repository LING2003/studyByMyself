package study.byMyself;

import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        Random random = new Random();
        int num=random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入你要猜的数字");
            int guessNum=scanner.nextInt();
            if (guessNum>num)
                System.out.println("大了");
            else if (guessNum<num)
                System.out.println("小了");
            else {
                System.out.println("猜对了");
                break;
            }
        }



    }
}
