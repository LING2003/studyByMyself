package study.byMyself.myMap.test;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    /*
    自动点名器2：
    班级里有N个学生
    要求：
    70%概率随机到男生
    30%概率随机到女生
     */

    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("宋六", 26);
        Student s5 = new Student("全智恒", 20);
        Student s6 = new Student("金秀妍", 21);
        Student s7 = new Student("巴拉拉", 25);
        Student s8 = new Student("稀奇古怪", 23);
        Student s9 = new Student("笑眯眯", 21);
        Student s10 = new Student("乐呵呵", 19);
        Student s11 = new Student("七七八八", 18);
        Student s12 = new Student("牛逼", 12);
        Student s13 = new Student("阿玮", 23);
        Student s14 = new Student("阿西吧", 22);

        //创建概率集合
        ArrayList<Integer> probability = new ArrayList<>();
        Collections.addAll(probability, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(probability, 0, 0, 0);
        Collections.shuffle(probability);
        //创建男、女集合
        ArrayList<Student> boy = new ArrayList<>();
        ArrayList<Student> girl = new ArrayList<>();
        //给集合添加学生对象
        Collections.addAll(boy, s1, s2, s3, s4, s5, s11, s12, s13);
        Collections.addAll(girl, s6, s7, s8, s9, s10, s14);

        //获取概率集合对象
        Random r = new Random();
        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < 100; i++) {
            int index = r.nextInt(probability.size());
            System.out.println("index:"+index);
            if (probability.get(index) == 1) {
                //男生
                int boyIndex = r.nextInt(boy.size());
                String name = boy.get(boyIndex).getName();
                System.out.println(name);
                boyCount++;
            } else {
                //女生
                int girlIndex = r.nextInt(girl.size());
                String name = girl.get(girlIndex).getName();
                System.out.println(name);
                girlCount++;
            }
            System.out.println(boyCount+"   "+girlCount);
        }

    }

}
