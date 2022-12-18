package study.byMyself;

public class 数组转字符串 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String result = ArrToString(arr);
        System.out.println(result);
    }
    public  static  String ArrToString(int []arr){
        if (arr == null)
            return "";
        if (arr.length==0)
            return "[]";
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1)
            result=result+arr[i]+", ";
            else result=result+arr[i]+"]";
        }
        return result;
    }
}
