package com.asit.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data//省去get/set/toString 方法
@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
public class Person {
    //@Value("${person.name}")
    private String name;
    //@Value("#{${person.age}*2}")//自动计算，如果ConfigurationProperties不支持
    private int age;
    private boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private List<String> lists;
    private Dog dog;
    private String lastName;

    @Override
    public String toString(){
        return "姓名="+name;
    }
}
