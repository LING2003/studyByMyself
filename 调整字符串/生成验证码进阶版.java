package study.byMyself.调整字符串;

import java.util.Random;

public class 生成验证码进阶版 {
  /*
    需求：定义实现随机产生一个5位的验证码
    验证码格式：
    长度为5
    4位是大写字母或者小写字母，1位是数字
    数字可以出现在任意位置
     */
  public static void main(String[] args) {
      char[] Alphabet = new char[52];
      for (int i = 0; i < Alphabet.length; i++) {
          if (i<26){
              Alphabet[i]=(char)(97+i);
          }else
              Alphabet[i]=(char)(65+i-26);
      }
      //随机生成0~9数字
      Random r = new Random();
      int num = r.nextInt(10);//注意需要给nextInt限定范围，否则会因为数字过大而被拆分成多个整数。
      //随机生成4个字母
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < 4; i++) {
          int randomIndex = r.nextInt(Alphabet.length);
          result.append(Alphabet[randomIndex]);
      }
      result.append(num);
      //System.out.println(result);
      char[] chars = result.toString().toCharArray();
      //System.out.println(chars);
      StringBuilder lastResult = new StringBuilder();
      for (int i = 0; i < chars.length; i++) {
          int randomIndex = r.nextInt(chars.length);
          char temp;
          temp=chars[i];
          chars[i]=chars[randomIndex];
          chars[randomIndex]=temp;

      }
      lastResult.append(chars);
      System.out.println(lastResult);
  }
}
