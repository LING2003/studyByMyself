package study.byMyself.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    /*
    需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
    存储三个键值对元素，并遍历
    要求：同姓名，同年龄认为是同一个学生
    //使用map集合，键如果重复就会被覆盖
     */
    public static void main(String[] args) {
        //创建一个HashMap集合
        HashMap<Student, String> hm = new HashMap<>();
        //存入数据
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("张三", 20);
        Student s3 = new Student("李四", 21);
        System.out.println(hm.put(s1, "济南"));//济南 -> null
        System.out.println(hm.put(s2, "聊城"));//聊城 -> 济南
        System.out.println(hm.put(s3, "济宁"));//济宁 -> null
        System.out.println(hm);
        System.out.println("------------");

        //将键存入单列集合
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }
            System.out.println("------------");
        //键值对
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry);
        }
        System.out.println("------------");
        //lambda表达式
        hm.forEach((Student s,String nativePlace)->{
            System.out.println(s+" = "+nativePlace);
        });

    }
}