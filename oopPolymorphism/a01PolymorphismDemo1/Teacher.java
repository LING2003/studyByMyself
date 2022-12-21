package study.byMyself.oopPolymorphism.a01PolymorphismDemo1;

public class Teacher extends Person{
    @Override
    void show(){
        System.out.println("老师的信息为"+getName()+", "+getAge());
    }
}
