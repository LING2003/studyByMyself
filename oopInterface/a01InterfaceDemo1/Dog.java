package study.byMyself.oopInterface.a01InterfaceDemo1;

public class Dog extends Animal implements swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("🐕吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
