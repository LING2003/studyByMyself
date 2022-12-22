package study.byMyself.oopInterface.a02InterfaceDemo2;

public class BasketballSportAthlete extends SportAthlete {
    public BasketballSportAthlete() {
    }

    public BasketballSportAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球");
    }
}
