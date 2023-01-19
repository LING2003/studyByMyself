package study.byMyself.myMap.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    /*
    自动点名器3：
    班级里有N个学生
    要求：
    被点到的学生不会再被点到
    但是如果班级中的所有的学生都点完了，
    需要重新开启第二轮点名
     */
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("宋六", 26);
        Student s5 = new Student("全智恒", 20);
        Student s6 = new Student("金秀妍", 21);
        Student s7 = new Student("巴拉拉", 25);
        Student s8 = new Student("稀奇古怪", 23);
        Student s9 = new Student("笑眯眯", 21);
        Student s10 = new Student("乐呵呵", 19);
        Student s11 = new Student("七七八八", 18);
        Student s12 = new Student("牛逼", 12);
        Student s13 = new Student("阿玮", 23);
        Student s14 = new Student("阿西吧", 22);

        //创建集合
        ArrayList<Student> list = new ArrayList<>();

        //给集合添加学生对象
        Collections.addAll(list, s1, s2, s3, s4, s5, s11, s12, s13);
        Collections.addAll(list, s6, s7, s8, s9, s10, s14);

        //创建一个空集合用来存放集合一删除的学生对象
        ArrayList <Student> list2 = new ArrayList<>();
        //获取概率集合对象
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int index = r.nextInt(list.size());
            Student student = list.get(index);
            System.out.println(student.getName());
            Collections.addAll(list2,student);
            list.remove(index);
            if (list.size()==0){
                System.out.println("-------------------");
                list.addAll(list2);
                list2.clear();
            }
        }


    }
}
