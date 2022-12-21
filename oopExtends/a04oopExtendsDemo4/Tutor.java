package study.byMyself.oopExtends.a04oopExtendsDemo4;

public class Tutor extends Teacher{
    @Override
    void work(){
        System.out.println("正在当助教");
    }

    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }
}
