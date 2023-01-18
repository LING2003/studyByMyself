package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    /*
    Map集合的第三种遍历方式 lambda表达式
     */
    public static void main(String[] args) {
        //1.创建Map集合
        Map<String,String> map = new HashMap<>();
        //2.给集合添加元素
        map.put("刘备","接着奏乐接着舞");
        map.put("曹操","不可能绝对不可能");
        map.put("张飞","俺也一样");
        //3.通过lambda表达式的形式对集合进行遍历
        //匿名内部类格式
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+" = "+value);
            }
        });
        System.out.println("------------");
        //lambda格式
        map.forEach((key,value) -> System.out.println(key+" = "+value));
    }
}
