package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2test1 {
    /*
    三个课堂练习：
    练习一：利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
    练习二：利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
    练习三：利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历
     */
    //练习一：利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
    public static void main(String[] args) {
        //Map集合的第一种遍历方式————键找值

        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();
        //2.添加元素
        map.put("雷伊","赛尔号");
        map.put("迪莫","洛克王国");
        map.put("咪咔","赛尔号");
        //3.通过键找值

        //3.1获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();
        //3.2遍历单列集合，得到每一个值
        for (String key : keys) {
            //System.out.println(key);
            //3.3利用map集合中的键获取对应的值 get
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
