package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3test1 {
    /*
    三个课堂练习：
    练习一：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
    练习二：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
    练习三：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用lambda表达式的形式进行遍历
     */
    // 练习一：通过键值对对象进行遍历Map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
    public static void main(String[] args) {
        //创建map集合
        Map<String,String> map = new HashMap<>();
        //给集合添加元素
        map.put("李白","韩信");
        map.put("安琪拉","亚瑟");
        map.put("瑶","马可波罗");
        map.put("云缨","小芳芳");
        //map的第二种遍历方式 键值对entrySet
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }


    }
}
