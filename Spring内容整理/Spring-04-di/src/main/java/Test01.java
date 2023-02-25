import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        //1.常量注入
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s1 = (Student) context.getBean("s1");
        System.out.println(s1.getName());
        //2.bean注入
        Student s2 = (Student) context.getBean("s2");
        System.out.println(s2.getName() + s2.getAddress());
        //3.数组注入
        Student s3 = (Student) context.getBean("s3");
        System.out.println(s3.toString());
        //4.List注入
        Student s4 = (Student) context.getBean("s4");
        System.out.println(s4.toString());
        //5.Map注入
        Student s5 = (Student) context.getBean("s5");
        System.out.println(s5.toString());
        //6.Set注入
        Student s6 = (Student) context.getBean("s6");
        System.out.println(s6.toString());
        //7.null注入
        Student s7 = (Student) context.getBean("s7");
        System.out.println(s7.toString());
        //8.Properties注入
        Student s8 = (Student) context.getBean("s8");
        System.out.println(s8.toString());
    }
@Test
public void test2(){
    ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
    User user = (User) context.getBean("u1");
    System.out.println(user);
}
}
