package study.byMyself.oopInterface.a02InterfaceDemo2;

public abstract class SportAthlete extends Person{
    public SportAthlete() {
    }

    public SportAthlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();

}
