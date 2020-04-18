package com.asit.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@PropertySource(value = {"classpath:person.properties"})
@Service
public class HelloService {
    @Value("${name}")
    private String name;
    public String getMsg(){
        return name+",service层";
        //Driver.getInstance();
    }
}
