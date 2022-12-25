package study.byMyself.RegexAPI.a10RegexDemo10;

public class RegexDemo10 {
    public static void main(String[] args) {
        /*需求：
                将字符串：我要学学编编编编程程程程程程程程
                替换为：我要学编程
                //需求:把重复的内容 替换为 单个的
                //学学                学
                //编编编编            编
                //程程程程程程        程

         */

        //  (.)表示把重复内容的第一个字符看做一组
        //  \\1表示第一字符再次出现
        //  + 至少一次
        //  $1 表示把正则表达式中第一组的内容，再拿出来用
        //如下：regex="(.)\\1+"同regex="(.)\\1+(.)\\2+(.)\\3+"结果相同
        String str = "我要学学编编编编程程程程程程程程";
        String regex = "(.)//1+(.)//2+(.)//3+";
        String result2 = str.replaceAll("(.)\\1", "$1");
        System.out.println(result2);//我要学编编程程程程
        //String result1 = str.replaceAll("(.)\\1+", "$1");
        //System.out.println(result1);//我要学编程
        String result = str.replaceAll("(.)\\1+(.)\\2+(.)\\3+", "$1$2$3");
        System.out.println(result);//我要学编程



    }
}
