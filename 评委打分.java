package study.byMyself;

import java.util.Scanner;

public class 评委打分 {
    /*
    需求：在唱歌比赛中，有6名评委给选手打分，分数范围是【0-100】之间的整数。
    选手的最后得分为：去掉最高分、最低分后的4个评委的平均分
     */
    //定义一个数组，用来存储6名评委的打分（0-100）
    // int scorearr = get
    public static void main(String[] args) {
        int [] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
    //求出数组中的最大值
        int max = getMax(scoreArr);
    //求出数组中的最小值
        int min = getMin(scoreArr);
    //求出数组中6个数的和
        int sum = getSum(scoreArr);
    //求出数组中减去最大值和最小值后的平均值
        int avg = (sum-max-min)/(scoreArr.length-2);
    //打印结果
        System.out.println("数组中减去最大值和最小值后的平均值为："+avg);
    }
    public static int getMax(int [] scoreArr){
        int max= scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i]>max)
                max=scoreArr[i];
        }
        return max;
    }
    public static int getMin(int [] scoreArr){
        int min= scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i]<min)
                min=scoreArr[i];
        }
        return min;
    }
    public static int getSum(int [] scoreArr){
        int sum=0;
        for (int i = 0; i < scoreArr.length; i++) {
           sum=sum+scoreArr[i];
        }
        return sum;
    }

    public static int[] getScores() {

        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {//for()括号中没有i++是在if条件判断语句中给i自增设置了条件！
            System.out.println("请输入评委打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else
                System.out.println("输入有误，当前i值=" + i);
        }
        return scores;
    }

}
