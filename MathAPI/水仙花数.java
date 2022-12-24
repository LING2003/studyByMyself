package study.byMyself.MathAPI;

public class 水仙花数 {
    //100~999之间
    public static void main(String[] args) {
        //统计一共有几个水仙花数
        int count=0;
        for (int i = 100; i < 1000; i++) {

            int bai = i/100;
            int shi = i/10%10;
            int ge = i%10;
            double sum = Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3);
            if (i==sum){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共有"+count+"个水仙花数");
    }
}
