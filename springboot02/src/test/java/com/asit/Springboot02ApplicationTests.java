package com.asit;

import com.asit.bean.Person;
import com.asit.hello.HelloCtrl;
import com.asit.hello.HelloDao;
import com.asit.hello.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)//设置启动器
@SpringBootTest(classes={Springboot02Application.class})//指定启动类
class Springboot02ApplicationTests {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private Person person;
    @Resource
    private HelloCtrl helloCtrl;
    @Resource
    private ApplicationContext applicationContext;

    @Test
    void existBean() {
        log.info("slf4j={}",person);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        if(applicationContext.containsBean("helloService")) {
            HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
            logger.info(String.valueOf(applicationContext.containsBean("helloService")));
            logger.info(helloService.getMsg());
        }else{
            logger.info("helloService不存在");
        }
    }


    @Test
    void existBean2() {
        System.out.println(applicationContext.containsBean("helloDao"));
        HelloDao helloDao = applicationContext.getBean("helloDao", HelloDao.class);
        System.out.println(helloDao.getMsg());
    }
    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(helloCtrl.getMsg());
    }

}
