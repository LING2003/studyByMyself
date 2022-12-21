package study.byMyself.mystatic.a03staticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){
        
    }
    //获取集合中最大学生的年龄方法
    //静态，方便调用
    public static int getMaxAge(ArrayList<Student> list){
        int max=0;
        for (int i = 0; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if (tempAge>max)
                max=tempAge;
        }
        return max;
    }
}
