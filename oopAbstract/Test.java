package study.byMyself.oopAbstract;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("大黑",2);
        dog.eat();
        dog.drink();
        System.out.println("--------------------");
        Animal frog = new Frog("小绿",1);
        frog.eat();
        System.out.println("--------------------");
        Animal sheep = new Sheep("大白",3);
        sheep.eat();
    }
}
