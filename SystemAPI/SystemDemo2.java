package study.byMyself.SystemAPI;

public class SystemDemo2 {
    //返回当前系统时间
    public static void main(String[] args) {
        //判断1~10000有多少个质数
        long start = System.currentTimeMillis();
        for (int i = 1; i < 10000; i++) {
            boolean flag = isPrime2(i);
            if (flag){
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    //方法一：用时40ms
    public static boolean isPrime1(int number){
        for (int i = 2; i < number; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    //改良后
    //方法二用时24ms
    public static boolean isPrime2(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number%i==0){
                return false;
            }

        }
        return true;
    }
}
