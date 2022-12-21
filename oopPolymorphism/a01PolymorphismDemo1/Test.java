package study.byMyself.oopPolymorphism.a01PolymorphismDemo1;

public class Test {
    public static void main(String[] args) {
//学生
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(19);

//教师
        Teacher t = new Teacher();
        t.setName("lisi");
        t.setAge(27);
//管理员
        Administer a = new Administer();
        a.setName("guanli");
        a.setAge(32);

        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}
