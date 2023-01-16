package study.byMyself.myVessel.a04mySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    /*
    利用Set系列的集合，添加字符串，并使用多种方式遍历
    ①迭代器
    ②增强for
    ③Lambda表达式
     */
    public static void main(String[] args) {
        //创建一个Set集合
        Set<String> set = new HashSet<>();
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        set.add(s1);
        set.add(s2);
        set.add(s3);
        //迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------");
        //增强for
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-----------");
        //Lambda表达式
        set.forEach(s -> System.out.println(s));
    }
}
