package study.byMyself.myVessel.a04mySet;

import java.util.TreeSet;

public class A04TreeSetDemo3 {
    /*
    需求：请自行选择比较器排序和自然排序两种方式；
    要求：存入四个字符串，"c","ab","df","qwer"
    按照长度排序，如果一样长则按照首字母排序

    采用第二种排序方式：比较器排序
     */
    public static void main(String[] args) {
/*
        //创建集合 完整格式
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //判断长度是否相等
                int i = o1.length()-o2.length();
                //一样长，则按照首字母排序
                i = i==0?o1.compareTo(o2):i;
                return i;
            }
        });
 */
        //创建集合 lambda格式
        TreeSet<String> ts = new TreeSet<>((o1, o2) ->{
            //判断长度是否相等
            int i = o1.length()-o2.length();
            //一样长，则按照首字母排序
            i = i==0?o1.compareTo(o2):i;
            return i;
        });
        //给集合添加对象
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        //打印结果
        System.out.println(ts);//[c, ab, df, qwer]
    }
}
