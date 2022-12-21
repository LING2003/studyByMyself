package study.byMyself.oopPolymorphism.a01PolymorphismDemo1;

public class Administer extends Person{
    @Override
    void show(){
        System.out.println("管理员的信息为"+getName()+", "+getAge());
    }
}
