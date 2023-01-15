package study.byMyself.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    /*
    定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
    要求:
    按照字符串的长度进行排序，短的在前面，长的在后面
    （暂时不比较字符串里面的内容）
     */
    public static void main(String[] args) {
        String[] str = {"a","aa","aaa","aaaa"};
        //原始方法：匿名内部类
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(Arrays.toString(str));
        //进阶方法：lambda表达式完整格式
        Arrays.sort(str,((o1, o2) -> {return o1.length()-o2.length();}));//不要忘记分号哟
        System.out.println(Arrays.toString(str));
        //高阶方法：lambda表达式简写格式
        Arrays.sort(str,(o1,o2)->o1.length()-o2.length());
        System.out.println(Arrays.toString(str));
    }
}
