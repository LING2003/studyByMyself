package study.byMyself.oopInterface.a01InterfaceDemo1;

public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("🐇吃胡萝卜");

    }


}
