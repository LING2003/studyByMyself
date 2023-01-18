package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    /*
    V put(K key,V value)                    添加元素
    V remove(Object key)                    根据键删除键值对元素
    void clear()                            移除所有的键值对元素
    boolean containsKey(Object key)         判断集合是否包含指定的键
    boolean containsValue(Object value)     判断集合是否包含指定的值
    boolean isEmpty()                       判断集合是否为空
    int size()                              集合的长度，也就是集合中键值对的个数
     */

    public static void main(String[] args) {
        //创建Map集合
        Map<String,String> map = new HashMap<>();
        //向集合中添加元素
        map.put("郭靖","黄蓉");
        map.put("abc","Abc");
        map.put("def","Def");
        System.out.println(map.put("杨过", "小龙女"));
        System.out.println(map.put("杨过", "龙女"));
        System.out.println(map);
        System.out.println(map.remove("abc"));
        System.out.println(map);
        map.clear();
        System.out.println(map);
        System.out.println(map.containsKey("abc"));
        System.out.println(map.containsValue("黄蓉"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());

    }
}
