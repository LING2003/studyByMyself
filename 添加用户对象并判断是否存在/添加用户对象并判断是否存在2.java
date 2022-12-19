package study.byMyself.添加用户对象并判断是否存在;

import java.util.ArrayList;

public class 添加用户对象并判断是否存在2 {
    public static void main(String[] args) {
          /*
        需求：不同于-添加用户对象并判断是否存在1
        1.main方法中定义一个集合，存入三个用户对象。
        用户属性为：id，username，password；
        2.定义一个方法，根据id查找对应的用户信息。
        如果存在，返回索引；
        如果不存在，返回-1；
         */
        //定义集合
        ArrayList<User> list = new ArrayList<>();
        //创建对象
        User user1 = new User(1, "zs", "123");
        User user2 = new User(2, "ls", "1234");
        User user3 = new User(3, "ww", "12345");
        //添加元素
        list.add(user1);
        list.add(user2);
        list.add(user3);
        //调用方法,查找索引
        int getIndex=getIndex(list,4);
        System.out.println(getIndex);
    }
    //定义方法
    public static int getIndex(ArrayList<User> list,int id){
        for (int i = 0; i < list.size(); i++) {
           int compareId = list.get(i).getId();
           if (compareId==id){
               return i;//存在->返回索引
           }
        }return -1;//不存在->返回-1
    }
}
