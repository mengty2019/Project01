package com.asit.hello;

import com.asit.bean.Dog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController//等同于@Controller+@ResponseBody
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
public class HelloCtrl {
    @Value("${name}")
    private String name;
    private Dog dog;

    @RequestMapping("/getMsg")
    public String getMsg(){
        return  name+",hello world！"+dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
