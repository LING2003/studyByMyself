package com.lyd.config;

import com.lyd.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//这个也会被Spring容器托管，注册到容器中，因为它本来就是一个@Component
//@Configuration代表这是一个配置类，相当于之前的beans.xml
@Configuration
@ComponentScan
public class LydConfigure {


    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User user(){
        return new User();//就是返回要注入到bean的对象
    }
}
