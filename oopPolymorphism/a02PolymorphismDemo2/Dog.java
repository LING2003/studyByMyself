package study.byMyself.oopPolymorphism.a02PolymorphismDemo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    void lookHome(){
        System.out.println("小狗正在看家");

    }
    @Override
    void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
    }
}
