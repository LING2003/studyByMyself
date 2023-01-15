package study.byMyself.RecursionSort;

public class RecursionSortDemo1 {
    /*
    递归求和
    需求：求1~100之间的和

    核心：1.找出口 2.找规律
     */
    public static void main(String[] args) {
        System.out.println(getSum(100));
    }

    private static int getSum(int num) {
        //如果是1，则返回1
        if (num==1){
            return 1;
        } else {
            //如果不是1，则返回num+getSum(num-1);
            return num+getSum(num-1);
        }

    }
}
