package study.byMyself.BinarySearch;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        数据如下：{7，23，45，67，89，97，105，188}
         */
        int[] arr={7,23,45,67,89,97,105,188};
        int index = binarySearch(arr,97);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr,int num) {
        //1.定义两个变量记录要查找的范围(最小索引和最大索引)
        int min = 0;
        int max = arr.length-1;

        //2.利用循环不断地去找要查询到数据
        while (true){
            if (min>max){
                return -1;
            }
            int mid = (min+max)/2;
            if (arr[mid]>num){
                max = mid-1;
            } else if (arr[mid]<num) {
                min = mid+1;
            } else {
                return mid;
            }

        }
    }
}
