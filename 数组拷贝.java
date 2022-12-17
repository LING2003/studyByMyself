package study.byMyself;

public class 数组拷贝 {
    public static void main(String[] args) {
        int[]arr={2,0,0,3,0,2,0,8};
        int []copyArr=newArr(arr,2,8);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]);
        }
    }
    public static int[] newArr(int []arr,int from,int to){
        int []newArr=new int[to-from];
        int index=0;
        for (int i = from; i < to; i++) {
            newArr[index]=arr[i];
            index++;
        }
        return newArr;
    }
}
