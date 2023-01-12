package study.byMyself.BasicSearch;

import java.util.ArrayList;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
          /*
        课堂练习2：
        需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        要求：需要考虑数组中元素是否重复
         */
        int[] arr = {101,24,67,22,53,68,103,22};
        ArrayList<Integer> list = basicSearch(arr, 22);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static ArrayList<Integer> basicSearch(int[]arr,int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                list.add(i);
            }
        }
        return list;
    }
}
