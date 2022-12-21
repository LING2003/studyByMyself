package study.byMyself.oopPolymorphism.a02PolymorphismDemo2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    void catchMouse(){
        System.out.println("小猫正在逮老鼠");
    }
    @Override
    void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧着头吃"+something);
    }
}
