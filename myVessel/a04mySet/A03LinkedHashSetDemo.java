package study.byMyself.myVessel.a04mySet;

import java.util.LinkedHashSet;

public class A03LinkedHashSetDemo {
    public static void main(String[] args) {
        /*
        LinkedHashSet特点：有序、不重复、无索引
         */
        //创建集合
        LinkedHashSet<Student2> lhs = new LinkedHashSet<>();
        //创建对象
        Student2 s1 = new Student2("zhangsan", 16, "2021");
        Student2 s2 = new Student2("zhangsan", 16, "2021");
        Student2 s3 = new Student2("lisi", 18, "2020");
        Student2 s4 = new Student2("wangwu", 20, "2067");
        //给集合添加对象,并打印结果
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs);
    }
}