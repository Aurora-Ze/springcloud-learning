package com.edu.neu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: Aurora
 * @Title: DashboardAppication
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/24 14:51
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableHystrixDashboard
public class DashboardAppication {
    public static void main(String[] args) {
        SpringApplication.run(DashboardAppication.class, args);
    }
}
