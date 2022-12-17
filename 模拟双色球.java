package study.byMyself;

import java.util.Random;
import java.util.Scanner;
//数组越界异常：看看是不是arr[arr.length]括号里没减1
public class 模拟双色球 {
    public static void main(String[] args) {
//        1.生成中奖号码
        int[] arr = createNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }        System.out.println();
//        2.用户输入彩票号码（红球+蓝球）
        int[] userInputArr=userInputNumber();

//        3.判断用户中奖情况
        int redCount=0;
        int blueCount=0;
//        判断红球中奖情况

        for (int i = 0; i < userInputArr.length-1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] == redNumber) {
                    redCount++;
                    break;
                }
            }
        }
//        判断蓝球中奖情况
        int blueNumber = userInputArr[userInputArr.length-1];
        if (arr[arr.length-1]==blueNumber)
            blueCount++;

        System.out.println(redCount+" "+blueCount);
//        根据红篮球中将个数判断中奖情况
        if (redCount==6&&blueCount==1)
            System.out.println("恭喜你，中奖1000万");
        else if (redCount==6)
            System.out.println("恭喜你，中奖500万");
        else if (redCount==5&&blueCount==1)
            System.out.println("恭喜你，中奖3000");
        else if (redCount==5||redCount==4&&blueCount==1) {
            System.out.println("恭喜你，中奖200");
        }
        else if (redCount==4||redCount==3&&blueCount==1) {
            System.out.println("恭喜你，中奖10");
        }
        else if (redCount==2&&blueCount==1||redCount==1&&blueCount==1||redCount==0&&blueCount==1) {
            System.out.println("恭喜你，中奖5");
        }
        else{
            System.out.println("本次未中奖，感谢您对福彩事业的支持");
        }

    }

    public static int[] userInputNumber() {
//        1.创建数组用于添加用户购买的号码
//        6个红球，1个蓝球 数组长度：7
        int[] userArr = new int[7];
//        2.随机生成号码并添加到数组当中
//        红球：不能重复 1 2 3 4 5 6
//        蓝球：可以和红球重复 5
        //        生成红球号码并添加到数组当中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
//            获取红球号码
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = Contains(userArr, redNumber);
                if (!flag) {
//            把红球号码添加到数组当中
                    userArr[i] = redNumber;
                    i++;
                } else System.out.println("号码重复");
            }
        }
        while (true) {
            System.out.println("请输入蓝球号码：");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                userArr[userArr.length - 1] = blueNumber;
                break;
            } else System.out.println("蓝球输入有误，请重新输入。");

        }
        return userArr;
    }

    public static int[] createNumber() {
//        1.创建数组用于添加中奖号码
//        6个红球，1个蓝球 数组长度：7
        int[] arr = new int[7];
//        2.随机生成号码并添加到数组当中
//        红球：不能重复 1 2 3 4 5 6
//        蓝球：可以和红球重复 5

//        生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
//            获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = Contains(arr, redNumber);
            if (!flag) {
//            把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }
//        生成蓝球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static boolean Contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return true;
            }

        }
        return false;
    }
}
