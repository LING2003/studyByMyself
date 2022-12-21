package study.byMyself.oopExtends.a04oopExtendsDemo4;

public class Buyer extends AdminStaff{
    @Override
    void work(){
        System.out.println("采购中...");
    }

    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }
}
