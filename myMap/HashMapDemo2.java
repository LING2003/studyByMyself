package study.byMyself.myMap;

import java.util.*;

public class HashMapDemo2 {
    /*
    需求：
    某个班级80名学生，现在需要组成秋游活动，
    班长提供了四个景点依次是（A\B\C\D）,
    每个学生只能选择一个景点，请统计出最终那个景点想去的人最多。
     */
    public static void main(String[] args) {

        Random r = new Random();
        //创建ArrayList集合
        ArrayList<String> l = new ArrayList<>();
        //将A\B\C\D存入集合，然后在A\B\C\D中随机获取80个数
        String[] str = {"A","B","C","D"};
        for (int i = 0; i < 80; i++) {
            //在A\B\C\D中随机获取80个数
            int index = r.nextInt(str.length);
            //将获取到的A、B、C、D的个数存入集合
            l.add(str[index]);
        }
        //创建一个Map的键值对集合
        //键存放景点名称
        //值存放相应景点票数
        Map<String,Integer> map = new HashMap<>();
        for (String name : l) {
            if (map.containsKey(name)){
                Integer count = map.get(name);
                count++;
                map.put(name,count);
            }else {
                map.put(name,1);
            }
        }


        int max = 0;
        //遍历集合，获取对应的景点及票数,求最大值
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if (count>max){
                max=count;
            }
        }
        System.out.println(map);

        //判断哪个景点的票数和最大值景点的票数一样，并打印
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue()==max){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
}
