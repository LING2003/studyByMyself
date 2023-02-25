import com.lyd.config.LydConfigure;
import com.lyd.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void  test(){
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载！
        ApplicationContext context1 = new AnnotationConfigApplicationContext(LydConfigure.class);
        User user1 = context1.getBean("user", User.class);
        System.out.println(user1.getName());
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        User user = context.getBean("user", User.class);
//        System.out.println(user.getName());
    }
}
