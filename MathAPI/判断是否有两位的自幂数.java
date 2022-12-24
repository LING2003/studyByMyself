package study.byMyself.MathAPI;

public class 判断是否有两位的自幂数 {
    public static void main(String[] args) {
    //10~99
        //统计个数
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int ge = i%10;
            int shi = i/10;
            double sum = Math.pow(ge,2)+Math.pow(shi,2);
            if (i == sum){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("两位的自幂数个数"+count);
    }

}
