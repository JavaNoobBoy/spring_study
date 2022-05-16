package com.jtc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

@Configuration
@ComponentScan("com.jtc")
@EnableAspectJAutoProxy
public class SpringConfig {


    @Bean
    DateTimeFormatter dateTimeFormatter() {
        return DateTimeFormatter
                .ofPattern("yyyy-MM-dd")
                .withResolverStyle(ResolverStyle.STRICT);
    }
}
