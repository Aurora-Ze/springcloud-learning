package com.edu.neu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: Aurora
 * @Title: GatewayApplication
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/24 16:54
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
