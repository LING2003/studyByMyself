package study.byMyself.RegexAPI.a11RegexDemo11;

public class RegexDemo11 {
    public static void main(String[] args) {
        //身份证号码的简易正则表达式
        //非捕获分组:仅仅是把数据括起来
        //特点:不占用组号
        //这里\\1报错原因:(?:)就是非捕获分组，此时是不占用组号的。


        //(?:) (?=) (?!)都是非捕获分组//更多的使用第一个
        //String regex1 ="[1-9]\\d{16}(?:\\d|x|x)\\1";
        String regex2 = "[1-9]\\d{16}(\\d Xx)\\1";
        //^([01]\d|2[0-3]):[0-5]\d:[@-5]\d$

        System.out.println("41080119930228457x".matches(regex2));
    }
}
