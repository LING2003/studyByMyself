package study.byMyself.RegexAPI.a04RegexDemo4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
      /*
            需求:把下面文本中的座机电话，邮箱，手机号，热线都爬取出来。
            来黑马程序员学习Java，
            手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，
            座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，
            热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090

            手机号的正则表达式:1[3-9]\d{9}
            邮箱的正则表达式:\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}座机电话的正则表达式:θ\d{2,3}-?[1-9]\d{4,9}
            热线电话的正则表达式:400-?[1-9]\\d{2}-?[1-9]\\d{3}

        */
      public static void main(String[] args) {
          String str="来黑马程序员学习Java，\n" +
                  "            手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，\n" +
                  "            座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，\n" +
                  "            热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";


          String regex = "(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                  "|(0\\d{2,3}-?[1-9]\\d{4,9})" +
                  "(400-?[1-9]\\d{2}-?[1-9]\\d{3})";
          //打印手机号
          String regex1 = "1[3-9]\\d{9}";
          //邮箱  \\w+@
          String regex2 = "\\w+@[\\w&&[^_]]{2,8}(\\.[\\w&&\\D&&[^_]]{2,3}){1,2}";
          //座机号
          String regex3 = "0\\d{2,3}-?[1-9]\\d{4,9}";
          //热线电话
          String regex4 = "400-[1-9]\\d{2}-?[1-9]\\d{3}";
          StringBuilder regex5 = new StringBuilder(regex1 + regex2 + regex3 + regex4);
          String regex6 = regex5.toString();
          Pattern p1 = Pattern.compile(regex1);
          Matcher m1 = p1.matcher(str);
          while (m1.find()){
              String s =m1.group();
              System.out.println(s);
          }
          Pattern p2 = Pattern.compile(regex2);
          Matcher m2 = p2.matcher(str);
          while (m2.find()){
              String s =m2.group();
              System.out.println(s);
          }
          Pattern p3 = Pattern.compile(regex3);
          Matcher m3 = p3.matcher(str);
          while (m3.find()){
              String s =m3.group();
              System.out.println(s);
          }
          Pattern p4 = Pattern.compile(regex4);
          Matcher m4 = p4.matcher(str);
          while (m4.find()){
              String s =m4.group();
              System.out.println(s);
          }
          Pattern p = Pattern.compile(regex);
          Matcher m = p.matcher(str);
          while (m.find()){
              String s =m.group();
              System.out.println(s);
          }
      }
}
