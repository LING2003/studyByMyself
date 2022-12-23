package study.byMyself.puzzleGame;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //需求：打乱一维数组中的数据
        int []tempArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        //打乱数组数据
        for (int i = 0; i < tempArr.length; i++) {
            int randomIndex = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = temp;
        }
        //遍历并打印数组
        System.out.print("[");
        for (int i = 0; i < tempArr.length; i++) {
            if (i<= tempArr.length-2)
                System.out.print(tempArr[i]+", ");
            else System.out.println(tempArr[i]+"]");
        }
        //创建二维数组
        int[][] data = new int[4][4];

        //给二维数组添加数据
        //解法二：
        //遍历二维数组，并用一维数组给二维数组data[][]赋值
        int index=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = tempArr[index];
                index++;
            }
        }

        //遍历二维数组得到数据
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
