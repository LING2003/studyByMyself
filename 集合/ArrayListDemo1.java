package study.byMyself.集合;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new  ArrayList<>();
        //练习：增、删、改、查
        //add(E e)
        boolean result = list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        System.out.println(result);
        System.out.println(list);

        //remove(E e) \ remove(int index)
        boolean result1 = list.remove("aaa");
        String result2 = list.remove(1);//返回值是删除的值。

        //E set(int index,E e)
        String result3 = list.set(1,"hhh");//返回值是修改前的值

        //E get(int index)
        String result4 = list.get(3);

        //获取长度 int size
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //list.get(i)获取元素
            String str = list.get(i);
            System.out.println(str);
        }
    }

}
