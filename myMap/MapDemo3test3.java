package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3test3 {
    /*
  三个课堂练习：
  练习一：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
  练习二：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
  练习三：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用lambda表达式的形式进行遍历
   */
    //练习三：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用lambda表达式的形式进行遍历
    public static void main(String[] args) {
        //创建map集合
        Map<String, String> map = new HashMap<>();
        //添加元素
        map.put("公孙离", "李信");
        map.put("貂蝉", "吕布");
        map.put("紫霞仙子", "至尊宝");
        //通过键值对对象进行遍历
        //通过entrySrt方法将所有键值对对象全部放入到set集合当中
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //lambda表达式遍历
        entries.forEach(set ->{
            String key = set.getKey();
            String value = set.getValue();
            System.out.println(key+" = "+value);
        });
    }
}