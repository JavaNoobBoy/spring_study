package com.jtc.test;

import com.jtc.config.SpringConfig;
import com.jtc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBatisTest {


    @Test
    public void testSpringIntegrateMybatis() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println("userService.findAllUser() = " + userService.findAllUser());
    }
}
