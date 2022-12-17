package study.byMyself.文字格斗游戏优化版;

public class 文字版格斗游戏测试 {
    public static void main(String[] args) {
        文字版格斗游戏 r1 = new 文字版格斗游戏("小火猴", 100, '男');
        文字版格斗游戏 r2 = new 文字版格斗游戏("布布花", 110, '女');
        r1.showRoleInfo();
        r2.showRoleInfo();
        //        开始格斗 回合制游戏
          while (true){
            //r1先手攻击r2
            r1.attack(r2);
            //判断r2的剩余血量
            if (r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O了"+r2.getName());
                break;
            }
            //r2开始攻击r1
            r2.attack(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+"K.O了"+r1.getName());
                break;
            }
        }



    }
}
