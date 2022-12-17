package study.byMyself;

public class 数组元素复制 {
/*
需求：将一个数组的元素复制到另一个数组中
 */
public static void main(String[] args) {
    int[]arr={1,2,3,4,5};
    int[]newArr=new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        newArr[i]=arr[i];
    }
    for (int i = 0; i < newArr.length; i++) {
        System.out.println(newArr[i]);
    }
}
}
