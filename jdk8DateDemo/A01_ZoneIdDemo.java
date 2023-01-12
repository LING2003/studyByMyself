package study.byMyself.jdk8DateDemo;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIdDemo {//时区
    public static void main(String[] args) {
        //1.获取所有时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());//602 (jdk版本不同时区个数不一样)
        System.out.println(zoneIds);//Asia/Shanghai

        //2.获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        //3.获取指定时区
        ZoneId zoneId1 = ZoneId.of("America/Marigot");
        System.out.println(zoneId1);//America/Marigot
    }
}
