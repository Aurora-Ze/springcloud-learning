package com.edu.neu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Aurora
 * @Title: FallBackApplication
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/24 13:27
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
public class FallBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(FallBackApplication.class, args);
    }
}
