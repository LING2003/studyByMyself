package study.byMyself.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ","[","]");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
        System.out.println(sj.length());
        String str = sj.toString();
        System.out.println(str);
    }

}
