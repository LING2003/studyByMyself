package study.byMyself.Lambda.Exercises;

public class Test5 {
       /*
    小明喜欢爬楼梯，有的时候一次爬一个台阶，有的时候一次爬两个台阶,有的时候一次爬三个台阶
    如果有20个台阶，一共有多少种爬法？
     */
       public static void main(String[] args) {
           int sum = getSum(20);
           System.out.println(sum);
       }

    private static int getSum(int step) {
           if (step==1){
               return 1;
           } else if (step==2) {
               return 2;
           } else if (step==3) {
               return 4;
           }
           else return getSum(step-1)+getSum(step-2)+getSum(step-3);
    }
}
