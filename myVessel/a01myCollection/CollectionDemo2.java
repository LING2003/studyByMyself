package study.byMyself.myVessel.a01myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    //4.判断元素是否包含
    //细节：底层是依赖equals方法进行判断是否存在的。
    //所以，
    // 如果集合中存储的是自定义对象，
    // 也想通过contains方法来判断是否包含，
    // 那么在javabean类中，一定要重写equals方法。
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();
        Student stu1 = new Student("zhangsan", 23);
        Student stu2 = new Student("lisi", 24);
        Student stu3 = new Student("wangwu", 25);
        coll.add(stu1);
        coll.add(stu2);
        coll.add(stu3);
        //判断学生是否在集合中
        Student stu4 = new Student("zhangsan",23);
        boolean result = coll.contains(stu4);
        System.out.println(result);//true
        //因为Student类中重写了equals方法，所以coll.contains(stu4)返回的是true。
    }


}
