package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2test3 {
     /*
    三个课堂练习：
    练习一：利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
    练习二：利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
    练习三：利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历
     */
    //练习三：利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历
     public static void main(String[] args) {
         //创建Map集合
         Map<String,String> map = new HashMap<>();
         //向集合中添加元素
         map.put("闪光利利","闪光电击兔");
         map.put("闪光皮皮","闪光波特尔");
         map.put("闪光尼尔","闪光艾菲亚");
         //键找值
         //把键放入单列集合
         Set<String> keys = map.keySet();
         keys.forEach(key ->{
                 String value = map.get(key);
                 System.out.println(key + " = "+value);
         });
     }
}
