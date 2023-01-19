package study.byMyself.myMap;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        /*
        public static <T> void sort(List<T list)                  排序
        public static <T> void sort(List<T>list,Comparator<T>c)   根据指定的规则进行排序
        public static <T> int binarySearch(List<T>list,T key)     以二分查找法查找元素
        public static <T> void copy(List<T dest,List<T>src)       拷贝集合中的元素
        public static <T> int fill(List<T>list,T obj)             使用指定的元素填充集合
        public static <T> void max/min(Collection<T>coll)         根据默认的自然排序获取最大/小值
        public static <T> void swap(List<?>list,int i,int j)      交换集合中指定位置的元素
         */
        //创建list集合
        ArrayList<String> list = new ArrayList<>();
        //创建一个字符串数组用来存放需要添加的字符串
        String[] strings={"wsfw","scdasd","dcvs","123","dvvbred","bfrdf","a","scda","cs","wsfw"};
        //将字符串数组存入集合
        Collections.addAll(list,strings);
        System.out.println(list);
        System.out.println("-------------");
        //排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("-------------");
        //根据指定规则排序
       /* Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);
        System.out.println("-------------");

        */
        //以二分查找法查找元素
        int i = Collections.binarySearch(list, "123");
        System.out.println(i);
        System.out.println("-------------");
        //拷贝集合中的元素
        ArrayList<String> newList = new ArrayList<>();
        String[] s2= new String[20];
        Collections.addAll(newList,s2);
        Collections.copy(newList,list);//新集合在前，旧集合在后
        System.out.println(newList);
        System.out.println("----------------");
        //使用指定的元素填充集合
        Collections.fill(newList,"a");//全部覆盖
        System.out.println(newList);
        //根据默认的自然排序获取最大/最小值
        System.out.println("max="+Collections.max(list));
        System.out.println("min="+Collections.min(list));
        //交换集合中指定位置的元素
        Collections.swap(list,0,1);//a和123发生交换
        System.out.println(list);
    }
}
