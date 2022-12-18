package study.byMyself.StringBuilder;

public class 拼接字符串 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arrToString(arr));

    }
    public static  String arrToString(int []arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                sb.append(arr[i]);
                sb.append("]");
            }else {
                sb.append(arr[i]);
                 sb.append(", ");
            }

        }
        String result = sb.toString();
        return result;
    }
}
