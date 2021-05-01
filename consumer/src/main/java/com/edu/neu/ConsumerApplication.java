package com.edu.neu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author: Aurora
 * @Title: ConsumerApplication
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/17 19:15
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
