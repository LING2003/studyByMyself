package study.byMyself.mystatic.a03staticDemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("zhangsan", 18, "男");
        Student stu2 = new Student("lisi", 19, "女");
        Student stu3 = new Student("wangwu", 17, "男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //获取学生最大年龄
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
