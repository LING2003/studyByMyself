package study.byMyself.myMap;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        /*
        public static <T> boolean addAll(Collection<T> c,T...elements)
        public static void shuffle(List<?> list)
         */
        //创建一个list集合
        ArrayList<String> list = new ArrayList<>();
        //创建一个字符串数组
        String[] strings = {"aaaa","efdef","sdad","ads","sad","wdaw","fr"};
        //批量添加元素
        Collections.addAll(list,strings);
        System.out.println(list);

        //集合乱序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
