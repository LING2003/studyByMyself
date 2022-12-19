package study.byMyself.调整字符串;

public class 调整字符串Case2 {
    public static void main(String[] args) {
        //给定字符串A、B；
        String A = "abcde";
        String B = "eabcd";
        //A的旋转操作就是将A最左边的字符移到最右边。

        //运用字符旋转的方法
        //比较数组A和B
        boolean flag = CompareStrings(A,B);
        System.out.println(flag);

    }
    
    //比较数组
    public static boolean CompareStrings(String A,String B){
        if (A.length()==B.length()){
            for (int i = 0; i < A.length(); i++) {
                A = rotate(A);
                System.out.println(A);
                if (A.equals(B)){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    
    //字符旋转的方法
    public static String rotate(String str){
    char[] arr = str.toCharArray();
    char  first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        String result = new String(arr);
        return result;
    }
}
