package study.byMyself.myVessel.a01myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo5 {
     /*
        迭代器的细节注意点：
            1.报错NoSuchElementException
            2.迭代器遍历完毕，指针不会复位
            3.循环中只能用一次next方法
            4.迭代器遍历时，不能用集合的方法进行增加或者删除
                暂时当做一个结论先行记忆，在今天我们会讲解源码详细的再来分析。
                如果我实在要删除：那么可以用迭代器提供的remove方法进行删除。
                如果我要添加，暂时没有办法。
       */
     public static void main(String[] args) {
         // 4.迭代器遍历时，不能用集合的方法进行增加或者删除
         Collection<String> coll = new ArrayList<>();
         coll.add("aaa");
         coll.add("bbb");
         coll.add("ccc");
         coll.add("ddd");
         Iterator<String> it = coll.iterator();
         while (it.hasNext()){
             String str = it.next();
             if("bbb".equals(str)){
                 //coll.remove("bbb");//ConcurrentModificationException并发修改异常
                 it.remove();
             }
         }
         System.out.println(coll);//[aaa, ccc, ddd]
     }
}
