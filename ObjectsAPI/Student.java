package study.byMyself.ObjectsAPI;

import java.util.Objects;

public class Student {
    //创建一个学生类，提供两个成员变量（name ， age）；
    // 并且提供对应的无参构造方法和有参构造方法以及get/set方法，
    // 并且重写toString方法和equals方法
    private String name ;       // 姓名
    private String age ;        // 年龄

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

}
