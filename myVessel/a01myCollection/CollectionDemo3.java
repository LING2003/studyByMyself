package study.byMyself.myVessel.a01myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    /*
    迭代器遍历
    相关的三个方法：
    Iterator<E> iterator()  :获取一个迭代器对象
    boolean hasNext()   :判断当前指向的位置是否有元素
    E next()    :获取当前指向的元素并移动指针
     */
    public static void main(String[] args) {
        //创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //获取迭代器对象
        //迭代器好比一个箭头，默认指向集合的0索引
        Iterator<String> it = coll.iterator();
        //利用循环不断地去获取集合中的每一个元素
        while (it.hasNext()){
            //next方法的两件事情：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }
    }

}
