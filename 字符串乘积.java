package study.byMyself;

public class 字符串乘积 {
    public static void main(String[] args) {
        /*
        给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积它们的乘积也表示为字符串形式。
         */
        // 给定两个以字符串形式表示的非负整数num1和num2
        String num1 = "100";
        String num2 = "666";
        String result = multiply(num1,num2);
        System.out.println(result);

    }
    public static int toNum(String num){
        //字符串转字符数组
          char[] c = num.toCharArray();
          StringBuilder sb = new StringBuilder();
          //System.out.println(c);//c->num1|num2
          int toNum = 0;
          for (int i = 0; i < num.length(); i++) {
             toNum = toNum*10 + c[i]-'0';
             // System.out.println(toNum);
        }return toNum;
    }
    public static  String  multiply(String num1,String num2){
        int mul = toNum(num1)*toNum(num2);
        //需要用到数字转字符串
        String result = "";
        result=result+mul;
       return result;
    }

}
