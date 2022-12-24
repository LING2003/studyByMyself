package study.byMyself.BigIntegerAPI;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        /*
            public BigInteger add(BigInteger val) 加法
            public BigInteger subtract(BigInteger val) 减法
            public BigInteger multiply(BigInteger val) 乘法
            public BigInteger divide(BigInteger val) 除法，获取商
            public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
            public boolean equals(Object x) 比较是否相同
            public BigInteger pow(int exponent) 次幂
            public BigInteger max/min(BigInteger val) 返回较大值/较小值
            public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误
        */

        //1.创建两个BigInteger对象
        BigInteger bi1 = BigInteger.valueOf(20);
        BigInteger bi2 = BigInteger.valueOf(5);

        //2.加法
        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);//25

        //3.除法，获取商和余数
        BigInteger[] arr = bi1.divideAndRemainder(bi2);
        System.out.println(arr[0]);//4
        System.out.println(arr[1]);//0

        //4.比较是否相同
        boolean result = bi1.equals(bi2);
        System.out.println(result);//false

        //5.次幂
        BigInteger bi4 = bi1.pow(2);
        System.out.println(bi4);//20的2次幂->400

        //6.max
        BigInteger bi5 = bi1.max(bi2);
        System.out.println(bi5);//bi1的值最大->20

        //7.转为int类型整数，超出范围数据有误
        /* BigInteger bi6 = BigInteger.valueOf(2147483647L);
         int i = bi6.intValue();
         System.out.println(i);
         */

        BigInteger bi6 = BigInteger.valueOf(200);
        double v = bi6.doubleValue();
        System.out.println(v);//200.0
    }
}
