package study.byMyself.ObjectAPI.a02ObjectDemo2;

import study.byMyself.ObjectAPI.Student;

public class ObjectDemo2 {
    //在测试类（ObjectDemo02）的main方法中，创建两个学生对象，然后比较两个对象是否相同
    public static void main(String[] args) {
        Student stu1 = new Student("张三",14);
        Student stu2 = new Student("张三",14);
        System.out.println(stu1 == stu2);//false
        //因为"=="号比较的是对象的地址值，
        // 而我们通过new关键字创建了两个对象，
        // 它们的地址值是不相同的。
        // 因此比较结果就是false。

        // 调用equals方法比较两个对象是否相等
//         未重写
        //boolean result = stu1.equals(stu2);

// 输出结果
//        System.out.println(result);//false
        //默认情况下equals方法比较的也是对象的地址值。
        //我们希望比较的是对象的属性，如果两个对象的属性相同，我们认为就是同一个对象；

        //那么要比较对象的属性，我们就需要在Student类中重写Object类中的equals方法。

//          重写后
        boolean result = stu1.equals(stu2);
        System.out.println(result);//true
        //此时equals方法比较的是对象的成员变量值，
        // 而stu1和stu2两个对象的成员变量值都是相同的。因此比较完毕以后的结果就是true。
    }
}
