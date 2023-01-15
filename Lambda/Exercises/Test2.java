package study.byMyself.Lambda.Exercises;

public class Test2 {
    /*
    有一个很有名的数学逻辑叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月生出一对兔子，
    小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月兔子的对数是多少？
     */
    public static void main(String[] args) {
        //求解1
        //创建一个长度为12的数组
        int[] arr = new int[12];
        //手动给一月份和二月份赋值
        arr[0] = 1;
        arr[1] = 1;
        //利用循环给剩余的月份赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);

        //求解2
        //利用递归的思想
        //找到递归的出口
        //找到递归的规律
        //Fn(3)=Fn(2)+Fn(1)
        int sum = getSum(12);
        System.out.println(sum);
    }

    private static int getSum(int month) {
        if (month==1||month==2){
            return 1;
        }else return (getSum(month-1)+getSum(month-2));
    }
}
