package study.byMyself.Lambda.Exercises;

public class Test4 {
    /*
    小明喜欢爬楼梯，有的时候一次爬一个台阶，有的时候一次爬两个台阶。
    如果有20个台阶，一共有多少种爬法？
     */
    public static void main(String[] args) {
        //递归思想
        //出口：1阶->1种，2阶->2种,20阶的爬法=19阶爬法+18阶爬法
        //规律：Fn(20)=Fn(19)+Fn(18)
        int sum = getSum(5);
        System.out.println(sum);
    }

    private static int getSum(int step) {
        if (step == 1) {
            return 1;
        } else if (step == 2) {
            return 2;
        } else {
            return getSum(step - 1) + getSum(step - 2);
        }
    }
}