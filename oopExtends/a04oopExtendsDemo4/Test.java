package study.byMyself.oopExtends.a04oopExtendsDemo4;

public class Test {
    public static void main(String[] args) {
        //讲师
        Lecturer l = new Lecturer("weilai001","lyd");
        System.out.println(l.getName()+", "+l.getId());
        l.work();
        System.out.println("---------------------");
        //助教
        Tutor t = new Tutor("weilai002","lyla");
        System.out.println(t.getName()+", "+t.getId());
        t.work();
        System.out.println("---------------------");
        //维护专员
        Maintainer m = new Maintainer("weilai003","lika");
        System.out.println(m.getName()+", "+m.getId());
        m.work();
        System.out.println("---------------------");
        //采购员
        Buyer b = new Buyer("weilai004","xiaowei");
        System.out.println(b.getName()+", "+b.getId());
        b.work();
    }

}
