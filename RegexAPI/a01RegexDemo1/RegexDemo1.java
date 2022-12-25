package study.byMyself.RegexAPI.a01RegexDemo1;

public class RegexDemo1 {
    /*
    需求：

​	请编写正则表达式验证用户输入的手机号码是否满足要求。

​	请编写正则表达式验证用户输入的邮箱号是否满足要求。

​	请编写正则表达式验证用户输入的电话号码是否满足要求。

​	验证手机号码 13112345678 13712345667 13945679027 139456790271

​	验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434

​	验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
     */
    public static void main(String[] args) {
        String phoneNum1 = "13112345678";
        String phoneNum2 = "13712345667";
        String phoneNum3 = "13945679027";
        String phoneNum4 = "139456790271";
        String regex1 = "1\\d{10}";
        System.out.println("------------验证手机号------------");
        System.out.println(phoneNum1.matches(regex1));
        System.out.println(phoneNum2.matches(regex1));
        System.out.println(phoneNum3.matches(regex1));
        System.out.println(phoneNum4.matches(regex1));
        System.out.println("------------验证座机号------------");
        String landlineNumber1 = "020-2324242";
        String landlineNumber2 = "02122442";
        String landlineNumber3 = "027-42424";
        String landlineNumber4 = "0712-3242434";
        String landlineNumber5 = "0635-2632553";
        String regex2 = "0\\d{2,3}-?[1-9]{4,9}";
        System.out.println(landlineNumber1.matches(regex2));
        System.out.println(landlineNumber2.matches(regex2));
        System.out.println(landlineNumber3.matches(regex2));
        System.out.println(landlineNumber4.matches(regex2));
        System.out.println(landlineNumber5.matches(regex2));
        System.out.println("------------验证邮箱号码------------");
        String email1 = "3232323@qq.com";
        String email2 = "zhangsan@itcast.cnn";
        String email3 = "dlei0009@163.com";
        String email4 = "dlei0009@pci.com.cn";
        //思路:
        //在书写邮箱号码正则的时候需要把正确的数据分为三部分
        //第一部分:@的左边 \\w+
        //      任意的字母数字下划线，至少出现一次就可以了
        //第二部分:@ 只能出现一次
        //第三部分:
        //      3.1         .的左边[\\w&&[^_]]{2,6}
        //                  任意的字母加数字，总共出现2-6次(此时不能出现下划线)
        //      3.2         . \\.
        //      3.3         大写字母，小写字母都可以，只能出现2-3次[a-zA-Z]{2,3}
        //      我们可以把3.2和3.3看成一组，这一组可以出现1次或者两次
        String regex3 = "\\w+@[\\w&&[^_]]{2,8}(\\.[\\w&&\\D&&[^_]]{2,3}){1,2}";
        //String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println(email1.matches(regex3));
        System.out.println(email2.matches(regex3));
        System.out.println(email3.matches(regex3));
        System.out.println(email4.matches(regex3));
//      新插件any-rule
    }
}
