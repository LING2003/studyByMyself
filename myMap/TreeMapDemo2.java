package study.byMyself.myMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    /*
    需求2：
    键：学生对象
    值：籍贯
    要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人
     */
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
               i = i == 0?o1.getName().compareTo(o2.getName()):i;
                return i;
            }
        });

        //创建并添加学生对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("张三",23);
        tm.put(s1,"济南");
        tm.put(s2,"聊城");
        tm.put(s3,"菏泽");
        tm.put(s4,"聊城");//键重复则覆盖
        //打印集合
        System.out.println(tm);
    }
}
