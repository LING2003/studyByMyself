package study.byMyself.mystatic.a02staticDemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1) ;
        System.out.println(str);

        double[] arr2={1.2,3.6,4.0,7.8,15.6};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}
