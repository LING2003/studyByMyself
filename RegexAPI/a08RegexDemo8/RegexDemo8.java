package study.byMyself.RegexAPI.a08RegexDemo8;

public class RegexDemo8 {
    //String类的replaceAll方法中使用正则表达式
    public static void main(String[] args) {
        /*
            有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中三个姓名之间的字母替换为vs
            要求2:把字符串中的三个姓名切割出来*/

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
//细节:
//方法在底层跟之前一样也会创建文本解析器的对象
//然后从头开始去读取字符串中的内容，只要有满足的，那么就用第一个参数去替换。
        String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result1);
    }
}
