package study.byMyself.myVessel.a04mySet;

import java.util.TreeSet;

public class A04TreeSetDemo2 {
    /*
    需求：创建TreeSet集合，并添加3个学生对象
    学生对象属性:（用Student）
    姓名、年龄
    要求按照学生的年龄进行排序
    同年龄按照姓名字母排列（暂不考虑中文）
    同姓名，同年龄认为是同一个人
     */
    public static void main(String[] args) {
        //创建集合
        TreeSet<Student> ts = new TreeSet<>();
        //创建学生对象
        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",21);
        Student s4 = new Student("zhangsan",20);
        //添加学生对象
        System.out.println(ts.add(s1));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s3));
        System.out.println(ts.add(s4));
        //打印结果
        System.out.println(ts);
    }

}
