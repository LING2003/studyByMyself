package study.byMyself.oopExtends.a04oopExtendsDemo4;

public class Teacher extends Employee{
    @Override
    void work(){
        System.out.println("正在教学");
    }

    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }
}
