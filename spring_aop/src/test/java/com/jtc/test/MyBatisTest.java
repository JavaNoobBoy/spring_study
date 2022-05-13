package com.jtc.test;

import com.jtc.config.SpringConfig;
import com.jtc.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBatisTest {

    @Test
    public void testSpringIntegrateMybatis() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        userDao.update();
        userDao.save();
    }
}
