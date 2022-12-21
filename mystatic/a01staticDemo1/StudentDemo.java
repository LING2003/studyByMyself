package study.byMyself.mystatic.a01staticDemo1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new study.byMyself.mystatic.a01staticDemo1.Student();
        s1.setName("李白");
        s1.setAge(19);
        s1.setGender("男");
        Student s2 = new Student();
        s2.setName("王潇潇");
        s2.setAge(18);
        s2.setGender("女");
        Student.teacherName="张三";
        s1.study();
        s1.show();
        s2.study();
        s2.show();

    }
}
