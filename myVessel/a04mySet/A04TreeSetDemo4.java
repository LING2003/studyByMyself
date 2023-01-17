package study.byMyself.myVessel.a04mySet;

import java.util.TreeSet;

public class A04TreeSetDemo4 {
    /*
    需求：创建5个学生对象
    属性：姓名、年龄、语文成绩、数学成绩、英语成绩
    按照总分从高到低输出到控制台
    如果总分一样，按照语文成绩排
    如果语文成绩一样，按照数学成绩排
    如果数学成绩一样，按照英语成绩排
    如果英语成绩一样，按照年龄排
    如果年龄一样，按照姓名的字母顺序排
    如果都一样，认为是同一个学生不存。
     */
    public static void main(String[] args) {
        //创建5个学生对象
        Student3 s1 = new Student3("zhangsan",20,89,98,93);
        Student3 s2 = new Student3("lisi",21,89,98,93);
        Student3 s3 = new Student3("wangwu",22,89,98,90);
        Student3 s4 = new Student3("songliu",22,89,98,93);
        Student3 s5 = new Student3("zhangsan",20,89,98,93);
        //创建集合，并使用比较器
        /*
        TreeSet<Student3> ts = new TreeSet<>(new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                double sum1 = o1.getChinese()+o1.getMath()+o1.getEnglish();
                double sum2 = o2.getChinese()+o2.getMath()+o2.getEnglish();
                double result = sum1 - sum2;
                if (result==0){
                    double Chinese = o1.getChinese()-o2.getChinese();
                    if (Chinese==0){
                        double Math = o1.getMath()-o2.getMath();
                        if (Math==0){
                            double English = o1.getEnglish()-o2.getEnglish();
                            if (English==0){
                                int age =o1.getAge()-o2.getAge();
                                if (age==0){
                                    int i = o1.getName().compareTo(o2.getName();
                                }
                            }else return (int)English;
                        }else return (int)Math;
                    }else return (int)Chinese;
                }
                return (int)result;
            }
        })

         */
        TreeSet<Student3> ts =new TreeSet<>();
        System.out.println(ts.add(s1));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s3));
        System.out.println(ts.add(s4));
        System.out.println(ts.add(s5));

        System.out.println(ts);

        for (Student3 t : ts) {
            System.out.println(t);
        }
    }
}
