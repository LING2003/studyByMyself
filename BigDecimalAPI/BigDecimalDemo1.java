package study.byMyself.BigDecimalAPI;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        System.out.println(0.09 + 0.01);//0.09999999999999999精度失真


            // 创建两个BigDecimal对象
            BigDecimal b1 = new BigDecimal("0.3") ;
            BigDecimal b2 = new BigDecimal("4") ;

            // 调用方法进行b1和b2的四则运算，并将其运算结果在控制台进行输出
            System.out.println(b1.add(b2));         // 进行加法运算 4.3
            System.out.println(b1.subtract(b2));    // 进行减法运算 -3.7
            System.out.println(b1.multiply(b2));    // 进行乘法运算 1.2
            System.out.println(b1.divide(b2));      // 进行除法运算 0.075
            //此时我们可以看到使用BigDecimal类来完成浮点数的计算不会存在损失精度的问题。

        }

    }

