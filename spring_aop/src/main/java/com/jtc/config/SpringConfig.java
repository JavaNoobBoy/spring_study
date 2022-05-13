package com.jtc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.time.format.DateTimeFormatter;

@Configuration
@ComponentScan("com.jtc")
@EnableAspectJAutoProxy
public class SpringConfig {


    @Bean
    DateTimeFormatter dateTimeFormatter() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }
}
