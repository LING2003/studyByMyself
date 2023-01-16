package study.byMyself.myVessel.a01myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo7 {
    public static void main(String[] args) {
        /*
        lambda表达式遍历
        forEach()
         */
        //创建集合并添加对象
        Collection<String> coll = new ArrayList<>();
        String s1 = "zhangsan";
        String s2 = "lisi";
        String s3 = "wangwu";
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        //collection的forEach方法
        coll.forEach(new Consumer<String>() {
            //底层for循环遍历
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //lambda表达式的简写格式
        coll.forEach(s -> System.out.println(s));
        //方法引用
        coll.forEach(System.out::println);//没学
    }
}
