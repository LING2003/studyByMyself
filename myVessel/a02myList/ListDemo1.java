package study.byMyself.myVessel.a02myList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    /*
    List系列集合独有的方法：
    void add(int index,E element)
    E remove(int index)
    E set(int index,E element)
    E get(int index)
     */
    public static void main(String[] args) {
        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        String s4 = "ddd";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list);
        System.out.println("------------");

        //在集合的指定位置插入指定元素
        list.add(1,"666");
        System.out.println(list);
        System.out.println("------------");

        //删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println("------------");

        //修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(0, "123"));
        System.out.println(list);
        System.out.println("------------");

        //返回指定索引处的元素
        System.out.println(list.get(0));
    }
}
