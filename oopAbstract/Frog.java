package study.byMyself.oopAbstract;

public class Frog extends Animal{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("吃虫子");
    }
}
