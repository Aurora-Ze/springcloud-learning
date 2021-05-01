package com.edu.neu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Aurora
 * @Title: Application
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/24 13:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan("com.edu.neu.mapper")
public class BreakerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BreakerApplication.class, args);
    }
}
