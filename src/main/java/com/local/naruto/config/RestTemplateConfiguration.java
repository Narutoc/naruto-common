package com.local.naruto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RestTemplateConfiguration {

    private static final int CONNECT_TIME_OUT = 5000;
    private static final int READ_TIME_OUT = 40000;
    private static final int MAX_POOL_SIZE = 100;

    @Bean
    public RedisTemplate redisTemplate() {
        return new RedisTemplate();
    }
}
