package com.jtc.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component
@Aspect
public class Advice {

    private static final Logger LOGGER = LoggerFactory.getLogger(Advice.class);

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Pointcut("execution(void com.jtc.dao.UserDao.save())")
    private void pt() {
    }


    @Before("pt()")
    public void printOutputTime() {
        LOGGER.info("方法执行日期时间: {}", DTF.format(LocalDateTime.now()));
    }
}
