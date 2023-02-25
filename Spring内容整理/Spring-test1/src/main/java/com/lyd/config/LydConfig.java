package com.lyd.config;

import com.lyd.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LydConfig {
    @Bean
    User user(){
        return new User();
    }
}
