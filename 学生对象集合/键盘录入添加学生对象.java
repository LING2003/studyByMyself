package study.byMyself.学生对象集合;

import java.util.ArrayList;
import java.util.Scanner;

public class 键盘录入添加学生对象 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<Student> list = new ArrayList<>();
        //键盘录入学生对象并添加到集合当中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建学生对象
            Student s = new Student();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            //把name和age的值赋值给学生对象
            s.setName(name);
            s.setAge(age);
            //将学生对象放入到集合当中
            list.add(s);
        }
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+stu.getAge());
        }
    }


}
