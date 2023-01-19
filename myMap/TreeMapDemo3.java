package study.byMyself.myMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        //创建一个字符串，并依次对字符串中的每个字符进行遍历统计
        String s = "aabsdnasdsxncdncanbd";
        //创建一个TreeMap集合
        TreeMap<Character,Integer> tm = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1 - o2;
                //o1.compareTo(o2)、o1-o2升序{a=4, b=2, c=2, d=4, n=4, s=3, x=1}
                //o2.compareTo(o1)、o2-o1降序{x=1, s=3, n=4, d=4, c=2, b=2, a=4}
            }
        });
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)){
                Integer count = tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                tm.put(c,1);
            }
        }
        System.out.println(tm);
    }
}
