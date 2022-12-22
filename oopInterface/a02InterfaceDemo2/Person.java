package study.byMyself.oopInterface.a02InterfaceDemo2;
//因为不想让外界创建人的对象，创建人的对象是没有意义的
//所以把Person类设置为抽象
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
