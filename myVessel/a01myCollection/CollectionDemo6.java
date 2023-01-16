package study.byMyself.myVessel.a01myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo6 {
    public static void main(String[] args) {
/*
增强for循环：
 */

        //创建一个集合
        Collection<String> coll = new ArrayList<>();
        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "ccc";
        String str4 = "ddd";
        coll.add(str1);
        coll.add(str2);
        coll.add(str3);
        coll.add(str4);
        for (String s : coll) {
            System.out.println(s);
            s="qqq";
        }
        //增强for循环的底层是迭代器，对迭代器进行修改不会对原有数值造成影响
        System.out.println(coll);
    }
}
