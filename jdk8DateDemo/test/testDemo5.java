package study.byMyself.jdk8DateDemo.test;

import java.time.LocalDate;
import java.util.Calendar;

public class testDemo5 {
    /*
    算法水题：
    判断任意的一个年份是闰年还是平年
    要求：用JDK7和JDK8两种方式判断
    提示：
    二月有29天是闰年
    一年有366天是闰年
     */
    public static void main(String[] args) {
        //JDK7
        //Calendar类
        Calendar calendar = Calendar.getInstance();
        //把时间设置为2000年3月1日
        calendar.set(2000,3-1,1);//日历类0月~11月
        //时间-1天，看当前的时间是28号还是29号
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        //如果当前时间是29号则是闰年，否则平年
        if (day==29){
            System.out.println(calendar.get(Calendar.YEAR)+"年是闰年");
        } else {
            System.out.println(calendar.get(Calendar.YEAR)+"年是平年");
        }

        //JDK8
        //LocalDate类
        //把时间设置为2000年3月1日
        LocalDate date = LocalDate.of(2000, 3, 1);
        //时间-1天，看当前的时间是28号还是29号
        LocalDate day1 = date.minusDays(1);
        System.out.println(day1.getDayOfMonth());
        //如果当前时间是29号则是闰年，否则平年
        if (day1.getDayOfMonth()==29){
            System.out.println(calendar.get(Calendar.YEAR)+"年是闰年");
        } else {
            System.out.println(calendar.get(Calendar.YEAR)+"年是平年");
        }


        //JDK8中还有一个直接判断是不是闰年的方法 isLeapYear()
        boolean leapYear = date.isLeapYear();
        System.out.println(leapYear);//true
    }
}
