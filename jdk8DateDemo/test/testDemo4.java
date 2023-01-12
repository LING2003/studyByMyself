package study.byMyself.jdk8DateDemo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class testDemo4 {
    /*
    请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
     */
    public static void main(String[] args) throws ParseException {
        //JDK7
        //规则：只要对时间仅向计算或者判断，都需要先获取当前时间的毫秒值
        //1.计算出生年月日毫秒值
        String birthday = "20030208";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        //2.获取当前时间的毫秒值
        long nowTime = System.currentTimeMillis();
        //3.计算间隔多少天
        long time = nowTime - birthdayTime;
        System.out.println(time/1000/60/60/24);


        //JDK8
        LocalDate birthday1 = LocalDate.of(2003, 2, 8);
        LocalDate now1 = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(birthday1,now1));
    }
}
