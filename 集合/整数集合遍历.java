package study.byMyself.集合;

import java.util.ArrayList;

public class 整数集合遍历 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加整数
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {

            if (i==list.size()-1){
                System.out.print(list.get(i));
            }else System.out.print(list.get(i)+", ");
        }
        System.out.println("]");
        System.out.println(list);
    }
}
