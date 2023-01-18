package study.byMyself.myMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    /*
    TreeMap基本应用：
    需求1：
    键：整数表示id
    值：字符串表示商品名称
    要求：按照id的升序排列、按照id的降序排列
     */
    public static void main(String[] args) {
        //创建TreeMap集合
        TreeMap<Integer,String> tm1 = new TreeMap<>();//默认升序
        //给集合添加元素
        tm1.put(5,"六个核弹");
        tm1.put(3,"百岁山纯净水");
        tm1.put(4,"狼人杀卡牌");
        tm1.put(1,"666汽水");
        tm1.put(2,"健身房会员卡");
        //打印集合
        System.out.println(tm1);

        //创建降序排列集合
        TreeMap<Integer,String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });//默认升序
        tm2.put(5,"六个核弹");
        tm2.put(3,"百岁山纯净水");
        tm2.put(4,"狼人杀卡牌");
        tm2.put(1,"666汽水");
        tm2.put(2,"健身房会员卡");
        //打印集合
        System.out.println(tm2);
    }


}
