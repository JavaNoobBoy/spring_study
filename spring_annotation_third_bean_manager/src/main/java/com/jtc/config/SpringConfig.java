package com.jtc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JDBCConfig.class})
@ComponentScan("com.jtc")
public class SpringConfig {




}
