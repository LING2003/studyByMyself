package study.byMyself.myMap.test;

import study.byMyself.myMap.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    /*
    自动点名器1：
    班级里有N个学生，实现随机点名器
     */
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("宋六",26);
        Student s5 = new Student("全智恒",20);
        Student s6 = new Student("金秀妍",21);
        Student s7 = new Student("巴拉拉",25);
        Student s8 = new Student("稀奇古怪",23);
        Student s9 = new Student("笑眯眯",21);
        Student s10 = new Student("乐呵呵",19);
        Student s11 = new Student("七七八八",18);
        Student s12 = new Student("牛逼",12);
        Student s13 = new Student("阿玮",23);
        Student s14 = new Student("阿西吧",22);

        //创建一个集合
        ArrayList<Student> list = new ArrayList<>();
        //将学生对象存入集合当中
        Collections.addAll(list,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14);
        System.out.println(list);
        //利用Random随机点名
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index).getName());

        //第二种随机方式
        Collections.shuffle(list);
        System.out.println(list.get(0).getName());

    }
}
