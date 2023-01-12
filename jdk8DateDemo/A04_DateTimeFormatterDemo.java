package study.byMyself.jdk8DateDemo;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DateTimeFormatterDemo {
    public static void main(String[] args) {
        //获取时间对象
        ZonedDateTime now = ZonedDateTime.now();
        //解析/格式化器
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒 EE a");
        //格式化
        System.out.println(dtf1.format(now));//2023年01月12日 09时32分06秒 周四 上午
    }
}
