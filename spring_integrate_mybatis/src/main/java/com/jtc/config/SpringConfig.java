package com.jtc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({JDBCConfig.class, MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.jtc")
@MapperScan("com.jtc.mapper")
public class SpringConfig {
}
