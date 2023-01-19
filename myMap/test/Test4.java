package study.byMyself.myMap.test;

import java.util.*;

public class Test4 {
    /*
    需求：
    定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
    添加完毕后，遍历结果格式如下：
    江苏省 = 南京市,扬州市,苏州市,无锡市,常州市
    湖北省 = 武汉市,孝感市,十堰市,宜昌市,鄂州市
    河北省 = 石家庄市,唐山市,邢台市,保定市,张家口市
     */
    public static void main(String[] args) {
        //创建集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("南京市");
        list1.add("扬州市");
        list1.add("苏州市");
        list1.add("无锡市");
        list1.add("常州市");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("武汉市");
        list2.add("孝感市");
        list2.add("十堰市");
        list2.add("宜昌市");
        list2.add("鄂州市");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("石家庄市");
        list3.add("唐山市");
        list3.add("邢台市");
        list3.add("保定市");
        list3.add("张家口市");

        //向集合中添加数据
        hm.put("江苏省", list1);
        hm.put("湖北省", list2);
        hm.put("河北省", list3);
        System.out.println(hm);
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",","","");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key+" = "+sj);
        }

    }

}
