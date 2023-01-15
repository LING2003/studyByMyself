package study.byMyself.RecursionSort;

public class RecursionSortDemo {
    /*
    需求：用递归求5的阶乘，并把结果在控制台输出
     */
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }

    private static int getFactorial(int num) {
        if (num==1){
            return 1;
        }else {
            return num*getFactorial(num-1);
        }

    }
}
