package study.byMyself.oopExtends.a03oopExtendsDemo3;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("weilai001","zhangsan",9000,8000);
        System.out.println(m.getId()+", "+m.getName()+", "+m.getSalary()+", "+m.getBonus());
        m.eat();
        m.work();
        System.out.println("----------------------");
        Cook c = new Cook();
        c.setId("weilai002");
        c.setName("lisi");
        c.setSalary(16800);
        System.out.println(c.getId()+", "+c.getName()+", "+c.getSalary());
        c.eat();
        c.work();
    }
}
