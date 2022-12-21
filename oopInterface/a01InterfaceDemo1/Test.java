package study.byMyself.oopInterface.a01InterfaceDemo1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("大黑",2);
        dog.eat();
        dog.swim();
        System.out.println("---------------------");
        Forg forg = new Forg("小绿",1);
        forg.eat();
        forg.swim();
        System.out.println("---------------------");
        Rabbit rabbit = new Rabbit("小白",2);
        rabbit.eat();
    }

}
