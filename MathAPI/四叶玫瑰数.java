package study.byMyself.MathAPI;

public class 四叶玫瑰数 {
    //1000-9999
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 10000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            int qian = i/1000;
            double sum = Math.pow(ge,4)+ Math.pow(shi,4)+ Math.pow(bai,4)+ Math.pow(qian,4);
            if (i==sum){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("四叶玫瑰数的个数："+count);
    }
}
