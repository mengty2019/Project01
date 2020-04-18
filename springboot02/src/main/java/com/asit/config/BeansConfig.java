package com.asit.config;

import com.asit.hello.HelloDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public HelloDao helloDao(){
        return new HelloDao();
    }
}
