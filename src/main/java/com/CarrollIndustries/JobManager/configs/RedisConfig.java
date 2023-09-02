package com.CarrollIndustries.JobManager.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPooled;

@Configuration
public class RedisConfig {

    @Bean
    public JedisPooled configureJedisPool() {
        return new JedisPooled("redis_stack_server", 6379);
    }
}
