import com.lyd.config.LydConfig;
import com.lyd.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LydConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
        System.out.println(user.toString());
    }
}
