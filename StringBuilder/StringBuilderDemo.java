package study.byMyself.StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");
        //2.添加元素
        sb.append("aaa").append("bbb");
        sb.append("111").append("222").append("333");
        //3.反转
        sb.reverse();
        //4.获取长度
        int len = sb.length();
        System.out.println(len);
        System.out.println(sb);
        //5.把StringBuilder变成字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
