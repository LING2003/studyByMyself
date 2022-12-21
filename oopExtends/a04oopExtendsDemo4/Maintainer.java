package study.byMyself.oopExtends.a04oopExtendsDemo4;

public class Maintainer extends AdminStaff{
    @Override
    void work(){
        System.out.println("职责是维护专员");
    }

    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }
}
