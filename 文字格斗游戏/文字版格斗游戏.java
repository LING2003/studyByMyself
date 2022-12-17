package study.byMyself.文字格斗游戏;

import java.util.Random;

public class 文字版格斗游戏 {
    private String name;
    private int blood;

    public 文字版格斗游戏() {
    }

    public 文字版格斗游戏(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(文字版格斗游戏 role){//文字版格斗游戏-->类名，role是类中的一个对象
        //计算造成的伤害1~20
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        //剩余血量
        int remainBlood = role.getBlood()-hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        remainBlood = remainBlood < 0?0:remainBlood;
        //修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        //this表示方法的调用者
        System.out.println(this.getName()+"举起拳头，打了"+role.getName()+"一下，造成了"+hurt+"点伤害，"+role.getName()+"还剩下"+remainBlood+"点血。");
    }
}
