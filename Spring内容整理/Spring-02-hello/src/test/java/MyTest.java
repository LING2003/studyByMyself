import com.lyd.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出来就好了
        Hello hello = (Hello) context.getBean("lyd");
        hello.show();
    }
}
