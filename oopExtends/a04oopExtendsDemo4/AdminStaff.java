package study.byMyself.oopExtends.a04oopExtendsDemo4;

public class AdminStaff extends Employee{
    @Override
    void work(){
        System.out.println("正在当专员");
    }

    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }
}
