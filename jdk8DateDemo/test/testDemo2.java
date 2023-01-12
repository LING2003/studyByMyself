package study.byMyself.jdk8DateDemo.test;

public class testDemo2 {
    /*
    算法水题：
    自己实现parseInt方法的效果，将字符串形式的数据转成整数
    要求：字符串中只能是数字不能有其他字符
    最少一位，最多十位
    0不能开头
     */
    public static void main(String[] args) {
        //1.定义一个字符串
        String str = "123";
        //2.校验字符串
        //习惯：把异常优先过滤，剩下来的就是正常数据
        if (!str.matches("[1-9]\\d{0,9}")){
            //错误数据
            System.out.println("数据格式有误");
        }else {
            System.out.println("数据格式正确");
        }
        //3.定义一个变量表示最终结果
        int num=0;
        //4.遍历字符串得到里面的每一个字符
        for (int i = 0; i < str.length(); i++) {
            int c =  (str.charAt(i) - '0');
            num = num*10+c;
        }
        //打印转换后的数字
        System.out.println(num);//123
        //判断是否成功转为数字
        System.out.println(num+1);//124
    }
}
