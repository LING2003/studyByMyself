package study.byMyself.ObjectAPI.a01ObjectDemo1;

import study.byMyself.ObjectAPI.Student;

public class ObjectDemo1 {
    //创建一个测试类（ObjectDemo01），
    // 在测试类的main方法中去创建学生对象，
    // 然后调用该对象的toString方法获取该对象的字符串表现形式，
    // 并将结果进行输出
    public static void main(String[] args) {
        Student stu = new Student("张三",18);
        //重写前
        //System.out.println(stu.toString());//study.byMyself.ObjectAPI.Student@10f87f48
        //重写后
        System.out.println(stu.toString());//Student{name='张三', age=18}
        //重写代码由系统生成

        // 直接输出对象s1
        System.out.println(stu);//Student{name='张三', age=18}
        //可以看到和刚才的输出结果是一致的。那么此时也就证明直接输出一个对象，那么会默认调用对象的toString方法
        //因此后期为了方便进行测试，我们常常是通过输出语句直接输出一个对象的名称。
    }
}
