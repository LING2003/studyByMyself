package study.byMyself.myVessel.a03myGenerics;

import java.util.ArrayList;

public class ListUtil {
    /*
    定义一个工具类：ListUtil
    类中定义一个静态方法addAll，用来添加多个集合的元素
     */

    private ListUtil() {
    }
    //类中定义一个静态方法addAll，用来添加多个集合的元素
    /*
    参数一：集合
    参数二~参数n：要添加的元素
     */
    public static<E> void addAll(ArrayList<E> list,E e1,E e2){
        list.add(e1);
        list.add(e2);
    }
    //使用可变参数,可同时添加多个元素
    public static<E> void addAll(ArrayList<E> list,E ...e){
        for (E e1 : e) {
            list.add(e1);
        }
    }
}
