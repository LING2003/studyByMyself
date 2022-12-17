package study.byMyself;

public class 数字加密 {
    /*
    需求：某系统的数字密码(大于0)。比如1983，采用加密方式进行传输，规则如下：
    每位数加上5
    再对10求余，
    最后将所有数字反转
    得到一串新数。
     */
    public static void main(String[] args) {
        int []arr= {1,9,8,3};
//        每位数加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
        }
//        再对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10;
        }
//         最后将所有数字反转
        for (int i=0,j= arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
//         得到一串新数
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        System.out.println(num);
    }
}
