package study.byMyself.BigIntegerAPI;
/*
public BigInteger(int num, Random rnd) 		//获取随机大整数，范围：[0 ~ 2的num次方-1]
public BigInteger(String val) 				//获取指定的大整数
public BigInteger(String val, int radix) 	//获取指定进制的大整数

下面这个不是构造，而是一个静态方法获取BigInteger对象
public static BigInteger valueOf(long val) 	//静态方法获取BigInteger的对象，内部有优化
 */
/*
 * 如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取。
 * 如果BigInteger表示的超出long的范围，可以用构造方法获取。
 * 对象一旦创建，BigInteger内部记录的值不能发生改变。
 * 只要进行计算都会产生一个新的BigInteger对象
 */
/*
BigInteger类中使用最多的还是提供的进行四则运算的方法，如下：
public BigInteger add(BigInteger val)					//加法
public BigInteger subtract(BigInteger val)				//减法
public BigInteger multiply(BigInteger val)				//乘法
public BigInteger divide(BigInteger val)				//除法
public BigInteger[] divideAndRemainder(BigInteger val)	 //除法，获取商和余数
public  boolean equals(Object x) 					    //比较是否相同
public  BigInteger pow(int exponent) 					//次幂、次方
public  BigInteger max/min(BigInteger val) 				//返回较大值/较小值
public  int intValue(BigInteger val) 					//转为int类型整数，超出范围数据有误
 */