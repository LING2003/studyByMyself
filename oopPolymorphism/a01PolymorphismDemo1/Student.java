package study.byMyself.oopPolymorphism.a01PolymorphismDemo1;

public class Student extends Person{
    @Override
    void show(){
        System.out.println("学生的信息为"+getName()+", "+getAge());
    }
}
