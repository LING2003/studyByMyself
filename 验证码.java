package study.byMyself;

import java.util.Random;

public class 验证码 {
    /*
    需求：定义实现随机产生一个5位的验证码
    验证码格式：
    长度为5
    前四位是大写字母或者小写字母
    最后一位是数字
     */
    public static void main(String[] args) {
        char[] chars = new char[52];

        for (int i = 0; i < chars.length; i++) {
            if (i < 26) {
            chars[i]=(char) (97+i);

            }
            else {
                chars[i]=(char)(65+i-26);

            }

        }
        String result = "";
        Random random = new Random();
        for (int j = 0; j < 4; j++) {

            int randomIndex = random.nextInt(chars.length);//random.nextInt("范围")-->0~52,即chars.length
            result = result +chars[randomIndex];

        }

        //随机生成一个0~9之间的数字
        int num = random.nextInt(10);
        result=result+num;
        System.out.println(result);
    }


}
