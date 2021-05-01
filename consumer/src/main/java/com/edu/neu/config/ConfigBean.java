package com.edu.neu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Aurora
 * @Title: ConfigBean
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/17 19:13
 */
@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
