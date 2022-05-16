package com.jtc.test;

import com.jtc.config.SpringConfig;
import com.jtc.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class MyBatisTest {

    @Test
    public void testSpringIntegrateMybatis() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        userDao.update();
        userDao.save();
    }

    @Test
    public void test() {
        /**
         * 16. 如何在java中使用自定义的格式器来解析日期
         */
        String goodFriday = "2021-02-29";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

            LocalDate holiday = LocalDate.parse(goodFriday, formatter);
//            formatter.parse("2020.01.32");
            System.out.println("formatter.format(holiday) = " + formatter.format(holiday));
            System.out.printf("字符 %s 转换成功后的日期是 %s%n", goodFriday, holiday);
            // 字符 02 06 2020 转换成功后的日期是 2020-02-06
        } catch (DateTimeParseException e) {
            System.out.printf("%s is not parsable!%n", goodFriday);
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        /**
         * 16. 如何在java中使用自定义的格式器来解析日期
         */
        String goodFriday = "2020-01-01";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd T").withResolverStyle(ResolverStyle.STRICT);
            LocalDate holiday = LocalDate.parse(goodFriday, formatter);
            System.out.printf("字符 %s 转换成功后的日期是 %s%n", goodFriday, holiday);
            // 字符 02 06 2020 转换成功后的日期是 2020-02-06
        } catch (DateTimeParseException e) {
            System.out.printf("%s is not parsable!%n", goodFriday);
            e.printStackTrace();
        }
    }
}
