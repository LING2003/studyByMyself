package study.byMyself.Lambda.Exercises;

public class Test3 {
    /*
    猴子吃桃子
    有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个。以后每天猴子都吃当前剩下来的一半，然后再多吃一个，第十天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共有多少个桃子？
     */
    public static void main(String[] args) {
        /*
        day10： 1
        day9：  (day10+1)*2=4
        day8:   (day9+1)*2=10
        每一天的桃子数量都是后一天数量加1，乘以2
         */
        //递归思想
        //递归的出口：第十天
        //递归的规律：每一天的桃子数量都是后一天数量加1，乘以2
        int eat = getEat(1);
        System.out.println(eat);
    }

    private static int getEat(int day) {
        if (day<=0||day>10){
            System.out.println("输入的时间有误");
            return -1;
        }

        if (day==10){
            return 1;
        }else return (2*(getEat(day+1)+1));

    }
}
