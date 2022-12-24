package study.byMyself.MathAPI;

public class 五角星数 {
    //10000-99999
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i < 100000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            int qian = i/1000%10;
            int wan = i/10000;
            double sum = Math.pow(ge,5)+Math.pow(shi,5)+Math.pow(bai,5)+Math.pow(qian,5)+Math.pow(wan,5);
            if (i==sum){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("五角星数的个数："+count);
    }
}
