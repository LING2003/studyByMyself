package study.byMyself.oopExtends.a04oopExtendsDemo4;

public class Lecturer extends Teacher{
    @Override
    void work(){
        System.out.println("正在授课");
    }

    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }
}
