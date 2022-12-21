package study.byMyself.oopPolymorphism.a02PolymorphismDemo2;

public class Test {
    public static void main(String[] args) {
        //猫
        Animal xiaohuang = new Cat(1,"黄");
        //狗
        Animal dahei = new Dog(3,"黑");
        //饲养员
        Person p = new Person();
        p.setName("张三");
        p.setAge(37);
        p.keepPet((Dog) dahei,"金汤骨头");
        p.keepPet((Cat) xiaohuang,"小鱼干");
    }

}
