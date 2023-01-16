package study.byMyself.myVessel.a02myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        /*
        List系列集合的五种遍历方式：
        1.迭代器
        2.列表迭代器
        3.增强for
        4.lambda表达式
        5.普通for循环
         */
        //创建集合并添加对象
        List<String> list = new ArrayList<>();
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        String s4 = "ddd";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //1.迭代器遍历
        //注意：迭代器和列表迭代器区别
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("--------------");
        //2.增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------");
        //3.Lambda表达式（同forEach同时使用）
        list.forEach(s -> System.out.println(s));
        System.out.println("--------------");
        //4.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------");
        //5.列表迭代器
        //列表迭代器额外添加了一种方法：在便利的过程中，可以添加元素
        //如下：把"qqq"添加到"ddd"之前
        ListIterator<String> it2 = list.listIterator();
        while (it.hasNext()) {
            String str = it.next();
            if ("bbb".equals(str)){
                //把"qqq"添加到"ddd"之前
                it2.add("qqq");
            }
        }
        System.out.println(list);
    }
}