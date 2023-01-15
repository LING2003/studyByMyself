package study.byMyself.ArraysAPI;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        /*
        public static String toString(数组) 把数组拼成一个字符串
        public static int binarySearch(数组，查找的长度) 二分查找法查找元素
        public static int[] copyOf(原数组，新数组长度) 拷贝数组
        public static int[] copyOfRange(原数组，起始索引，结束索引) 拷贝数组(指定范围)
        public static void fill(数组，元素) 填充数组
        public static void sort(数组) 按照默认方式进行数组排序
        public static void sort(数组，排序规则) 按照指定的规则排序
         */
        System.out.println("把数组拼成一个字符串:");
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String str = Arrays.toString(arr);
        System.out.println(str);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("---------------");
        System.out.println("二分查找法查找元素");
        int i = Arrays.binarySearch(arr,7);
        System.out.println(i);//6
        System.out.println("---------------");
        System.out.println("拷贝数组");
        int[] arr1 = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4, 5]
        int[] arr2 = Arrays.copyOf(arr,20);
        System.out.println(Arrays.toString(arr2));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println("---------------");
        System.out.println("拷贝数组(指定范围)");
        int[] arr3 = Arrays.copyOfRange(arr,1,6);
        System.out.println(Arrays.toString(arr3));//[2, 3, 4, 5, 6]
        System.out.println("---------------");
        System.out.println("填充数组");
        Arrays.fill(arr,6);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");
        System.out.println("按照默认方式进行数组排序");
        int[] arr4={3,6,9,12,4,1,8,5,2};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println("---------------");
        /*
        按照指定的规则排序 :见同包文件MyArraysDemo2.java
         */
    }
}
