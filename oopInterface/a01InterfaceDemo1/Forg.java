package study.byMyself.oopInterface.a01InterfaceDemo1;

public class Forg extends Animal implements swim{
    public Forg() {
    }

    public Forg(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("🐸吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
