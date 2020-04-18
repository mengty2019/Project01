package com.asit.hello;

import org.springframework.beans.factory.annotation.Value;

public class HelloDao {
    @Value("${name}")
    private String name;
    public String getMsg(){
        return name;
    }
}
