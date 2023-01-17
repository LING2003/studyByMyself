package study.byMyself.myVessel.a04mySet;

import java.util.Iterator;
import java.util.TreeSet;

public class A04TreeSetDemo1 {
    /*
    需求：利用TreeSet存储整数并进行排序
     */
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<Integer> ts = new TreeSet<>();
        //给集合添加元素
        ts.add(2);
        ts.add(6);
        ts.add(3);
        ts.add(1);
        ts.add(9);
        ts.add(0);
        System.out.println(ts);//[0, 1, 2, 3, 6, 9]
        System.out.println("----------");
        //迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer str = it.next();
            System.out.println(str);
        }
        System.out.println("----------");
        //增强for遍历
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("----------");
        //Lambda表达式遍历
        ts.forEach(i -> System.out.println(i));

    }
}
