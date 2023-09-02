package com.CarrollIndustries.JobManager.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPooled;

@Slf4j
@RestController
@RequestMapping("/jobs")
public class JobController {

    JedisPooled jedis;

    public JobController(JedisPooled pool){
        this.jedis = pool;
    }

    @GetMapping(path = "/test")
    public String getJob() {
        log.info("s");
        return jedis.get("mykey1");
    }
}
