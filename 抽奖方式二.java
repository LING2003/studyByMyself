package study.byMyself;

import java.util.Random;

public class 抽奖方式二 {
    /*
    抽奖方式一优化版

    需求:一个大V直播抽奖,奖品是现金红包,分别有{1,88,188,288,588}五个奖金,
    请使用代码模拟抽奖,打印出每个奖项,奖项的出现顺序要随机且不重复.
    打印效果如下:(随机顺序,不一定是下面的顺序)
    1元的奖金被抽出
    88元的奖金被抽出
    188元的奖金被抽出
    288元的奖金被抽出
    588元的奖金被抽出
     */
    public static void main(String[] args) {
//        1.把奖池里面的所有奖项打乱顺序
        int[] arr = {1,88,188,288,588};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex=random.nextInt(arr.length);
            int temp = arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
//        2.遍历奖池，从0索引开始获取每一个奖项
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
