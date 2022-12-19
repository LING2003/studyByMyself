package study.byMyself.学生对象集合;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        //1.定义一个集合
        ArrayList<Student> list = new ArrayList<>();
        //2.创建学生对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 20);
        Student s3 = new Student("王五", 21);
        Student s4 = new Student("宋六", 23);
        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //3.遍历
        System.out.println("姓名，年龄");
        for (int i = 0; i < list.size(); i++) {
            //i -> 索引 , list.get(i) 元素/学生对象
            //因为底层没做处理，直接打印list.get(i)打印的是地址值
            //study.byMyself.学生对象集合.Student@1ddc4ec2
            Student stu = list.get(i);
            System.out.println(stu.getName() + stu.getAge());

        }
    }
}
