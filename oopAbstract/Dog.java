package study.byMyself.oopAbstract;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("吃骨头");
    }


}
