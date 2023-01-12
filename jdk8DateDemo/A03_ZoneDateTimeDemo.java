package study.byMyself.jdk8DateDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A03_ZoneDateTimeDemo {
    public static void main(String[] args) {
        //1.获取当前时间对象（带时区）
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);//2023-01-12T09:21:27.811772200+08:00[Asia/Shanghai]

        //2.获取指定的时间对象（带时区）
        //年月日分秒纳秒方式指定
        ZonedDateTime time1 = ZonedDateTime.of(2023, 1, 12, 9, 19, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);//2023-01-12T09:19:12+08:00[Asia/Shanghai]

        //通过Instant+时区的方式指定获取时间对象
        Instant instant = Instant.ofEpochMilli(0);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);//1970-01-01T08:00+08:00[Asia/Shanghai]

        //3.withXxx 修改时间系列的方法
        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);//2000-01-01T08:00+08:00[Asia/Shanghai]

        //4.减少时间
        ZonedDateTime time4 = time3.minusYears(2);
        System.out.println(time4);//1998-01-01T08:00+08:00[Asia/Shanghai]

        //5.增加时间
        ZonedDateTime time5 = time4.plusYears(3);
        System.out.println(time5);//2001-01-01T08:00+08:00[Asia/Shanghai]

    }
}
