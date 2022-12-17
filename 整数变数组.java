package study.byMyself;

public class 整数变数组 {
    /*
    需求：把整数中的每一位都添加到数组之中

    反向推导：
    把整数中的每一位都添加到数组之中-->定义一个数组-->计算出数组的长度
     */
    public static void main(String[] args) {
//        计算出数组的长度
        int num = 12345;
//        定义一个临时变量temp，用来记录num的值，方便再次使用
        int temp = num;
//        定义一个变量进行统计
        int count=0;
        while (num!=0){
//            每一次循环就去掉右边一个数字
            num=num/10;
//            去掉一位计算器就自增一次
            count++;
        }
//        定义数组
//        动态初始化
        int[]arr = new int[count];
//        把整数上的每一位都添加到数组之中
        int index = arr.length-1;
        while (temp!=0){//12345
//            获取temp里面的每一位数组
            int ge = temp%10;
//            再去掉右边已获取的那个数字
            temp=temp/10;
            arr[index]=ge;
            index--;
        }
//        验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
