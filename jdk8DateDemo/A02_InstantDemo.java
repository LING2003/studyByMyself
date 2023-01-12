package study.byMyself.jdk8DateDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        //1.获取当前时间的Instant对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now);//2023-01-12T00:56:12.187260800Z

        //2.根据 秒/毫秒/纳秒 获取Instant对象
        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);//1970-01-01T00:00:01Z

        Instant instant2 = Instant.ofEpochMilli(3000L);
        System.out.println(instant2);//1970-01-01T00:00:03Z

        Instant instant3 = Instant.ofEpochSecond(0, 3000000000L);
        System.out.println(instant3);//1970-01-01T00:00:03Z

        //3.指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);//2023-01-12T09:01:43.998676700+08:00[Asia/Shanghai]

        //4.isXxx判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        //5.用于时间的判断
        //isBefore
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);//true
        //isAfter
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false

        //减少 minusXxx(long millisToSubtract)/增加 plusXxx 时间系列的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);//1970-01-01T00:00:03Z

        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);//1970-01-01T00:00:02Z

        Instant instant8 = instant6.plusSeconds(5L);
        System.out.println(instant8);//1970-01-01T00:00:08Z

    }
}
