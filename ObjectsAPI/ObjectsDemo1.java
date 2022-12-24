package study.byMyself.ObjectsAPI;

import java.util.Objects;

public class ObjectsDemo1 {
    //创建一个测试类（ObjectsDemo1）, 在该类中编写测试代码
    public static void main(String[] args) {

        method_04();
        method_03();//isNull结果与nonNull相反
        method_02();
        method_01();
    }
    // 测试nonNull方法
    public static void method_04() {

        // 创建一个学生对象
        Student s1 = new Student("zhangsan" , "14") ;

        // 调用Objects类中的nonNull方法
        boolean result = Objects.nonNull(s1);

        // 输出结果
        System.out.println(result);

    }
    // 测试isNull方法
    public static void method_03() {

        // 创建一个学生对象
        Student s1 = new Student("zhangsan" , "14") ;

        // 调用Objects类中的isNull方法
        boolean result = Objects.isNull(s1);

        // 输出结果
        System.out.println(result);

    }
    // 测试equals方法
    public static void method_02() {

        // 创建两个学生对象
        Student s1 = new Student("zhangsan" , "14") ;
        Student s2 = new Student("zhangsan" , "14") ;

        // 调用Objects类中的equals方法，比较两个对象是否相等
       boolean result = Objects.equals(s1,s2);
        // 如果Student没有重写Object类中的equals方法，此处比较的还是对象的地址值
        //重写之后比较的是属性

        // 输出结果
        System.out.println(result);

    }
    // 测试toString方法
    public static void method_01() {

        // 创建一个学生对象
        Student s1 = new Student("zhangsan" , "14") ;

        // 调用Objects中的toString方法,获取s1对象的字符串表现形式
        String result = Objects.toString(s1);
        // 如果Student没有重写Object类中的toString方法，此处还是返回的对象的地址值
        //重写后是Student{name='zhangsan', age='14'}

        // 输出结果
        System.out.println(result);

    }

}
