package com.jtc.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component
@Aspect
@Slf4j
public class Advice {


    private final DateTimeFormatter dateTimeFormatter;

    public Advice(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }

    /**
     * 切入点: 连接点中指定的一个或多个方法
     */
    @Pointcut("execution(* com.jtc.dao.*.*(..))")
    private void pt() {
    }

    /**
     * 方法体本身视为通知即增强的内容
     * 而@Before注解则是切面它声明了切入点如何与通知绑定,即可以理解为要给哪个具体的方法在什么位置增强
     * 在这个例子中就是在com.jtc.dao.UserDao.save()方法的开头执行增强的内容
     */
//    @Before("pt()")
//    public void printOutputTime() {
//        log.info("方法执行日期时间: {}", dateTimeFormatter.format(LocalDateTime.now()));
//    }


    @Around("pt()")
    public Object printOutputTime2(ProceedingJoinPoint pjp) throws Throwable {
        log.info("方法执行日期时间: {}", dateTimeFormatter.format(LocalDateTime.now()));
        Object proceed = pjp.proceed();
        log.info("获取到返回值之后继续执行(后续通知)...值:{}", proceed);
        return proceed;
    }
}
