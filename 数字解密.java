package study.byMyself;

public class 数字解密 {
        /*
    需求：某系统的数字密码(大于0)。比如1983，采用加密方式进行传输，规则如下：
    每位数加上5
    再对10求余，
    最后将所有数字反转
    得到一串新数。
    将加密后的数字进行解密
     */
        public static void main(String[] args) {
//            1.定义数组记录解密之后的结果
            int[] arr = {8,3,4,6};
//            2.反转
            for (int i=0,j=arr.length-1;i<j;i++,j--){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
//            3.由于加密是通过对10取余的方式进行获取的
//            所以在加密的时候就需要判断,0~4之间+10,5~9数字不变
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>=0&&arr[i]<=4){
                    arr[i]=arr[i]+10;
                }
            }
//            4.每一位-5
            for (int i = 0; i < arr.length; i++) {
                arr[i]-=5;
            }
//            5.将获取的数组打印拼接成最终结果
            int num=0;
            for (int i = 0; i < arr.length; i++) {
                num=num*10+arr[i];
            }
            System.out.println(num);
        }
}
