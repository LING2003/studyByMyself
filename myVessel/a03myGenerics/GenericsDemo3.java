package study.byMyself.myVessel.a03myGenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1,"aaa","bbb");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2,1000,2000,3000,6000);
        System.out.println(list2);
    }
}
