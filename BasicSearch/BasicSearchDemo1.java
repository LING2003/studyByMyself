package study.byMyself.BasicSearch;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        /*
        课堂练习1：
        需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        要求：不考虑数组中元素是否重复
         */
        int[] arr = {101,24,67,22,53,68,103,22};
        int index = basicSearch(arr, 22);
        System.out.println(index);
    }

    private static int basicSearch(int[] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
