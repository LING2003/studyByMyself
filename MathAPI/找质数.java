package study.byMyself.MathAPI;

public class 找质数 {
    public static void main(String[] args) {
        //打印1000以内的所有质数
        for (int i = 0; i < 1000; i++) {
            isPrime(i);
        }

    }
    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num%i==0){
                System.out.println(num);
                return false;
            }

        }
        return true;
    }
}
