package study.byMyself.BigIntegerAPI;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //public BigInteger(int num, Random rnd)
        // 获取随机大整数，范围：[0 ~ 2的num次方-1]
        Random r = new Random();
        BigInteger bi1 = new BigInteger(4,r);
        System.out.println(bi1);//[0 ~ 2的4次方-1]->[0,15]
        //public BigInteger(String val)
        // 获取指定的大整数
        BigInteger bi2 = new BigInteger("999999999999999999999");
        System.out.println(bi2);//999999999999999999999
        //public BigInteger(String val, int radix)
        // 获取指定进制的大整数
        BigInteger bi3 = new BigInteger("100",2);
        System.out.println(bi3);//4
        //static BigInteger valueOf(long val)
        // 静态方法获取BigInteger的对象，内部有优化->静态初始化[-16,16]
        BigInteger bi4 = BigInteger.valueOf(16);
        System.out.println(bi4);//16
    }
}
