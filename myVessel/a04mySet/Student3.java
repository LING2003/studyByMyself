package study.byMyself.myVessel.a04mySet;

import org.jetbrains.annotations.NotNull;

public class Student3 implements Comparable<Student3>{
    private String name;
    private int age;
    private int Chinese;
    private int Math;
    private int English;


    public Student3(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student3 o) {
        int sum1 = this.getChinese()+this.getMath()+this.getEnglish();
        int sum2 = o.getChinese()+o.getMath()+o.getEnglish();
        int i = sum1 - sum2;
        //写的复杂容易乱套
        i = i==0?this.getChinese()-o.getChinese():i;
        //上式分析：满足，如果i==0，则i=this.getChinese()-o.getChinese()，同下式中"："后的部分
        //即说明下式"："后的部分可以被i取代
        i=this.getChinese()-o.getChinese()==0?this.getMath()-o.getMath():this.getChinese()-o.getChinese();
        //以下同理
        i=this.getMath()-o.getMath()==0?this.getEnglish()-o.getEnglish():this.getMath()-o.getMath();
        i=this.getEnglish()-o.getEnglish()==0?this.getAge()-o.getAge():this.getEnglish()-o.getEnglish();
        i=this.getAge()-o.getAge()==0?this.getName().compareTo(o.getName()):this.getAge()-o.getAge();
        return i;
        //以下是简写格式
        /*
         //比较两者的总分
        int i = sum1 - sum2;
        //如果总分一样，就按照语文成绩排序
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        //如果语文成绩一样，就按照数学成绩排序
        i = i == 0 ? this.getMath() - o.getMath() : i;
        //如果数学成绩一样，按照英语成绩排序（可以省略不写）
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        //如果英文成绩一样，按照年龄排序
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //如果年龄一样，按照姓名的字母顺序排序
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
         */
    }
}
