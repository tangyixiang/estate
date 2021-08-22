package com.sky.estate.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.sky.**.mapper")
public class MybatisConfig {
}
