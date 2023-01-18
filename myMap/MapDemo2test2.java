package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2test2 {
      /*
    三个课堂练习：
    练习一：利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
    练习二：利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
    练习三：利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历
     */
    //练习二：利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
      public static void main(String[] args) {
          //创建Map集合
          Map<String,String> map =new HashMap<>();
          //给Map对象添加元素
          map.put("小火猴","烈焰猩猩");
          map.put("布布种子","布布花");
          map.put("伊尤","巴鲁斯");

          //通过键找值
          //把这些键放到一个单列集合当中
          Set<String> keys = map.keySet();
          //遍历单列结合，得到值
          Iterator<String> it = keys.iterator();
          while (it.hasNext()){
              //获得键所对应的值并输出打印
              String key = it.next();
              String value = map.get(key);
              System.out.println(key+" = "+value);
          }



      }
}
