package study.byMyself.添加手机对象并返回要求的数据;

import java.util.ArrayList;

public class PhoneDemo {
    public static void main(String[] args) {
        /*
        需求：
        main方法中定义一个集合，存入三个手机对象。
        分别为：小米，1000.苹果，8000.锤子，2999.
        定义一个方法，将价格低于3000的手机信息返回。
         */
        //定义一个集合
        ArrayList<Phone> list = new ArrayList<>();
        //存入三个手机对象
        //创建对象
        Phone p1 = new Phone("xiaomi", 1000);
        Phone p2 = new Phone("apple", 8000);
        Phone p3 = new Phone("smartphone", 2999);
        //添加元素
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phoneArrayList = LowerPrice(list);
        for (int i = 0; i < phoneArrayList.size(); i++) {//遍历
            Phone phone = phoneArrayList.get(i);
            System.out.println("品牌："+phone.getBrand()+" 价格："+phone.getPrice());//输出品牌、价格
        }
    }
    //定义一个方法
    public static ArrayList<Phone> LowerPrice(ArrayList<Phone> list) {
        ArrayList<Phone> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int price = list.get(i).getPrice();
            if (price < 3000) {//判断是否价格<3000
                Phone p = new Phone();//创建对象
                p.setPrice(price);//设置对象信息
                p.setBrand(list.get(i).getBrand());
                arrayList.add(p);//添加元素
            }

        }
        return arrayList;
    }
}
