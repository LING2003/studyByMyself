package study.byMyself.oopAbstract;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("吃草");
    }
}
