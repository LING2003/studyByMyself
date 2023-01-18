package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3test2 {
    /*
    三个课堂练习：
    练习一：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
    练习二：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
    练习三：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用lambda表达式的形式进行遍历
     */
    //练习二：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
    public static void main(String[] args) {
        //创建map集合
        Map<String,String> map = new HashMap<>();
        //添加元素
        map.put("公孙离","李信");
        map.put("貂蝉","吕布");
        map.put("紫霞仙子","至尊宝");
        //通过键值对对象进行遍历
        //通过entrySet方法获取所有键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //遍历set集合，并打印
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+" = "+value);

        }

    }
}
