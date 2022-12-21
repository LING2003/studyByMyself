package study.byMyself.oopExtends.a02oopExtendsDemo2;

public class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("吃狗粮");
    }
    void lookHome(){
        System.out.println("看家");
    }
}
