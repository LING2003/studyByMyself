package study.byMyself.jdk8DateDemo.test;

public class testDemo3 {
    /*
    算法水题：
    定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
     */
    public static void main(String[] args) {
        //十进制转二进制方法：除二取余法
        int num = 10;
        String BinaryString = toBinaryString(num);
        System.out.println(BinaryString);



    }


    public static String toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (num== 0) {
                break;
            }
            //先取余，后除以2
            int remaindar = num % 2;
            //将余数插入到索引的第0个位置
            sb.insert(0, remaindar);
            num = num / 2;

        }
        return sb.toString();
    }
}
