package study.byMyself.mystatic.a02staticDemo2;

public class ArrayUtil {
    //私有化构造方法，目的是不让外界创建它的对象
    private ArrayUtil(){

    }
//工具类方法需要定义为静态的方便调用
//打印数组
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else sb.append(arr[i]+", ");
        }sb.append("]");
        String result= sb.toString();
        return result;
    }
//求平均数
    public static double getAverage(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        double avg = sum/arr.length;
        return avg;
    }
}

