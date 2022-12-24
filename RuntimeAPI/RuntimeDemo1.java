package study.byMyself.RuntimeAPI;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取Runtime对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1==r2);//->true
        //2.exit 停止虚拟机
        //r1.exit(0);
            //简化写法->Runtime.getRuntime().exit(0);
        System.out.println("看看我执行了吗");
        //3.获得cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //4.内存总大小，单位byte字节
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024+"MB");
        //5.已经获取的总内存大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024+"MB");
        //6.剩余内存的大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024+"MB");
        //7.运行cmd命令
        //shutdown:关机
        //加上参数才能执行
        //-s：默认在1分钟之后关机
        //-s -t：指定时间：指定关机时间
        //-a：取消关机操作
        //-r：关机重启
        Runtime.getRuntime().exec("shutdown -a");
    }
}
