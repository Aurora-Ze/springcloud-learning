package com.edu.neu.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Aurora
 * @Title: ConfigBean
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/20 10:42
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
