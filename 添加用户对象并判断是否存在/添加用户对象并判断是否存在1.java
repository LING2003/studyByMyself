package study.byMyself.添加用户对象并判断是否存在;

import java.util.ArrayList;

public class 添加用户对象并判断是否存在1 {
    public static void main(String[] args) {
        /*
        需求：
        1.main方法中定义一个集合，存入三个用户对象。
        用户属性为：id，username，password；
        2.定义一个方法，根据id查找对应的用户信息。
        如果存在，返回true；
        如果不存在，返回false；
         */
        //定义集合
        ArrayList<User> list = new ArrayList<>();
        //创建3个对象
        User user1 = new User(1, "张三", "123");
        User user2 = new User(2, "李四", "1234");
        User user3 = new User(3, "王五", "12345");
        //添加元素
        list.add(user1);
        list.add(user2);
        list.add(user3);
        boolean flag = contain(list,3);
        System.out.println(flag);
    }
    //定义方法
    public static boolean contain(ArrayList<User> list,int id){//传两个参数！！！不是只能传一个，打破定向思维，多练习。
        for (int i = 0; i < list.size(); i++) {
            int compareId = list.get(i).getId();
            if (compareId==id){
                //如果找到了，直接返回true
                return true;
            }
        }//循环结束后返回false
        return false;
    }
}
