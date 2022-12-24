package study.byMyself.ObjectAPI;

public class Student {
    //创建一个学生类，
    // 提供两个成员变量（name ， age）；
    // 并且提供对应的无参构造方法和有参构造方法以及get/set方法
    private String name;
    private  int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //重写toString

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
        //这段代码就是把Student类中的成员变量进行了字符串的拼接。
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);// 比较的是对象的name属性值和age属性值
    }

}
