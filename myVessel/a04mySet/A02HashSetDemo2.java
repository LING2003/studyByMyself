package study.byMyself.myVessel.a04mySet;

import java.util.HashSet;

public class A02HashSetDemo2 {
    /*
    需求：创建一个存储学生对象的集合，存储多个学生对象。
    实用程序实现在控制台遍历该集合。
    要求：学生对象的成员变量值相同，我们就认为是同一个对象

    HashSet特点：无序、不重复、无索引
     */
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan", 16, "2021");
        Student2 s2 = new Student2("zhangsan", 16, "2021");
        Student2 s3 = new Student2("lisi", 18, "2020");
        Student2 s4 = new Student2("wangwu", 20, "2067");
        System.out.println(s1.hashCode());//1953091264
        System.out.println(s2.hashCode());//1953091264

        //创建HashSet集合
        HashSet<Student2> set = new HashSet<>();
        //添加对象并打印结果
        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        System.out.println(set.add(s3));
        System.out.println(set.add(s4));
        System.out.println(set);
    }
}
